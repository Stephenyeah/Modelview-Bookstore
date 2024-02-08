package fi.haagahelia.bookstore;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository){
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("The Old Man and the Sea", "Ernest Hemingway", 1952, 97819075-9027-6));
			repository.save(new Book("Romance of the Three Kingdoms", "Luo Guanzhong", 1907, 8951346));

			log.info("fetch all books");
			for (Book book : repository.findAll()){
				log.info(book.toString());
				}
			log.info("let's see all the title");
			for(Book book : repository.findByAuthor("Ernest Hemingway")){
				log.info(book.toString());
			}

		};
	}


}
