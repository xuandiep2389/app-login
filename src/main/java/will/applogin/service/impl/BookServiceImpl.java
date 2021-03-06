package will.applogin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import will.applogin.model.Book;
import will.applogin.repository.BookRepository;
import will.applogin.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Page<Book> findAllByName(String name, Pageable pageable) {
        return bookRepository.findAllByName(name,pageable);
    }

    @Override
    public Page<Book> findAllByAuthor(String author, Pageable pageable) {
        return bookRepository.findAllByAuthor(author, pageable);
    }

}
