package net.xerosoft.repository;

import net.xerosoft.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {
    List<Book> list();
    Book retrieve(Long id);
    Book create(Book quote);
    Book update(Long id, Book quote);
    boolean delete(Long id);
}
