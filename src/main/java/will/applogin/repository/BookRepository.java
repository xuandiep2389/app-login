package will.applogin.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import will.applogin.model.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {
    Page<Book> findAllByName(String name, Pageable pageable);
    Page<Book> findAllByAuthor(String author,Pageable pageable);
}
