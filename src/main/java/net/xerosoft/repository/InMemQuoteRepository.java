package net.xerosoft.repository;

import net.xerosoft.model.Quote;
import net.xerosoft.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class InMemQuoteRepository implements QuoteRepository {

    @Autowired
    private SequenceService sequence;

    List<Quote> quotes = new ArrayList<>();

    @PostConstruct
    public void init() {
        create(new Quote("gecko", "Hello World"));
    }

    @Override
    public List<Quote> list() {
        return quotes;
    }

    @Override
    public Quote retrieve(Long id) {
        return quotes.stream().filter(quote -> quote.id == id).findFirst().get();
    }

    @Override
    public Quote create(Quote quote) {
        quote.id = sequence.next();
        quotes.add(quote);
        return quote;
    }

    @Override
    public Quote update(Long id, Quote quote) {
        Quote old = retrieve(id);
        old.name = quote.name;
        quote.quote = quote.quote;
        return old;
    }

    @Override
    public boolean delete(Long id) {
        Quote quote = retrieve(id);
        if (quote == null) return false;
        quotes.remove(quote);
        return true;
    }
}
