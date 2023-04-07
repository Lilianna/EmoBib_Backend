package be.technobel.emobiblio.controller;

import be.technobel.emobiblio.exeption.BookNotAvailableException;
import be.technobel.emobiblio.exeption.ResourceNotFoundException;
import be.technobel.emobiblio.models.dto.BookDTO;
import be.technobel.emobiblio.models.form.BookForm;

import be.technobel.emobiblio.repository.BookRepository;
import be.technobel.emobiblio.service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("/")
    // GET request to retrieve all books
    public List<BookDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    // GET request to retrieve a book by ID
    public BookDTO getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public void insert(@RequestBody @Valid BookForm form) {
        bookService.createBook(form);
    }

    @PutMapping("/{id}")
    public BookDTO updateBook(@PathVariable Long id, @RequestBody BookForm book) {
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

//PostMapping: to check if book is available
}



