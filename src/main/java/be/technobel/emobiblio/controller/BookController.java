package be.technobel.emobiblio.controller;

import be.technobel.emobiblio.models.entity.Book;
import be.technobel.emobiblio.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/book")

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping // to map HTTP GET request onto specific handler method
    public List<Book> getAll() {
        return bookService.findAllBooks();
    }
}
