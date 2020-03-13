package net.xerosoft.service;

import net.xerosoft.model.Quote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuoteService {
    List<Quote> list();
    Quote retrieve(Long id);
    Quote create(Quote quote);
    Quote update(Long id, Quote quote);
    boolean delete(Long id);
}
