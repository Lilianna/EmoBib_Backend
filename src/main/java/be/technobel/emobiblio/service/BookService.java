package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.BookDTO;
import be.technobel.emobiblio.models.entity.Book;
import be.technobel.emobiblio.models.form.BookForm;

import java.util.List;

public interface BookService {
    List<BookDTO> getAllBooks();

    List<Book> searchBooks(String keyword);

    BookDTO getBookById(Long id);

    void createBook(BookForm book);

    BookDTO updateBook(Long id, BookForm book);

    void deleteBook(Long id);

//    public Page<Book> findPaginated(Pageable pageable);

}
