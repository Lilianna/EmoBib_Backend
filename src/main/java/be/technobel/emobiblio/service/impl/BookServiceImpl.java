package be.technobel.emobiblio.service.impl;

import be.technobel.emobiblio.exeption.NotFoundException;
import be.technobel.emobiblio.models.dto.BookDTO;
import be.technobel.emobiblio.models.entity.Author;
import be.technobel.emobiblio.models.entity.Book;
import be.technobel.emobiblio.models.form.AuthorForm;
import be.technobel.emobiblio.models.form.BookForm;
import be.technobel.emobiblio.repository.BookRepository;
import be.technobel.emobiblio.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
//@PathVariable annotaiton: used on a method argument to bind it to the value of a URI template variable
final BookRepository bookRepository;
public BookServiceImpl(BookRepository bookRepository){
    this.bookRepository = bookRepository;
}


@Override
public List<BookDTO> getAllBooks(){
    return bookRepository.findAll().stream()
            .map(BookDTO::from)
            .toList();
}
@Override
public BookDTO getBookById(Long id) {
    return bookRepository.findById(id)
            .map(BookDTO:: from)
            .orElseThrow(() -> new NotFoundException(String.format("Book not found with ID %d", id)));
}

@Override
public void createBook(BookForm book) {
    bookRepository.save(book.toEntity());
    }


@Override
public BookDTO updateBook(Long id, BookForm book) {
    Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook == null) {
            return null;
        }
    existingBook.setTitle(book.getTitle());
    existingBook.setIsbn(book.getIsbn());
//  existingBook.setAuthors(book.getAuthors());
    return BookDTO.from( bookRepository.save(existingBook) );
}


@Override
public void deleteBook(Long id) {
        var book = bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Book not found with ID %d", id)));
        bookRepository.deleteById(book.getId());
    }

@Override
public List<Book> searchBooks(String keyword) {
    if (keyword != null) {
        return bookRepository.search(keyword);
    }
    return bookRepository.findAll();
}

//•	searchBooks(String title, String author, String isbn)

}
