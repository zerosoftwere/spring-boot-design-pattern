package net.xerosoft;

import net.xerosoft.configuration.QuoteConfiguration;
import net.xerosoft.repository.BookRepository;
import net.xerosoft.repository.QuoteRepository;
import net.xerosoft.service.QuoteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Application {
    public static void main(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuoteConfiguration.class);

        QuoteRepository quoteRepository = context.getBean(QuoteRepository.class);
        System.out.println(quoteRepository.list());
        System.out.println();

        BookRepository bookRepository = context.getBean(BookRepository.class);
        System.out.println(bookRepository.list());
        System.out.println();

        QuoteService quoteService = context.getBean(QuoteService.class);
        quoteService.delete(0L);
        System.out.println();

        System.out.println(quoteService.list());
        System.out.println();
    }
}
