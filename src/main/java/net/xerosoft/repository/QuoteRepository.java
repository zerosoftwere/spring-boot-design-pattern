package net.xerosoft.repository;

import net.xerosoft.model.Quote;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository {
    List<Quote> list();
    Quote retrieve(Long id);
    Quote create(Quote quote);
    Quote update(Long id, Quote quote);
    boolean delete(Long id);
}
