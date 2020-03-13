package net.xerosoft.repository;

import net.xerosoft.model.Book;
import net.xerosoft.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemBookRepository implements BookRepository {

    @Autowired
    private SequenceService sequence;

    List<Book> books = new ArrayList<>();

    @PostConstruct
    public void init() {
        create(new Book("Salamander", "Spring for EE developers"));
    }

    @Override
    public List<Book> list() {
        return books;
    }

    @Override
    public Book retrieve(Long id) {
        return books.stream().filter(quote -> quote.id == id).findFirst().get();
    }

    @Override
    public Book create(Book book) {
        book.id = sequence.next();
        books.add(book);
        return book;
    }

    @Override
    public Book update(Long id, Book book) {
        Book old = retrieve(id);
        old.author = book.author;
        old.title = book.title;
        return old;
    }

    @Override
    public boolean delete(Long id) {
        Book book = retrieve(id);
        if (book == null) return false;
        books.remove(book);
        return true;
    }
}
