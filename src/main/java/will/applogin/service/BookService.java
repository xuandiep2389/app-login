package will.applogin.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import will.applogin.model.Book;

public interface BookService {

    Page<Book> findAll(Pageable pageable);

    void save(Book book);

    Book findById(int id);

    void remove(int id);

    Page<Book> findAllByName(String name, Pageable pageable);

    Page<Book> findAllByAuthor(String author,Pageable pageable);
}
