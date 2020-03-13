package net.xerosoft.service;

import net.xerosoft.model.Quote;
import net.xerosoft.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public List<Quote> list() {
        return quoteRepository.list();
    }

    @Override
    public Quote retrieve(Long id) {
        return quoteRepository.retrieve(id);
    }

    @Override
    public Quote create(Quote quote) {
        return quoteRepository.create(quote);
    }

    @Override
    public Quote update(Long id, Quote quote) {
        return quoteRepository.update(id, quote);
    }

    @Override
    public boolean delete(Long id) {
        return quoteRepository.delete(id);
    }
}
