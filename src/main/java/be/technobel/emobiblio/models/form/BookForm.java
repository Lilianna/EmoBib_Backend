package be.technobel.emobiblio.models.form;

import be.technobel.emobiblio.models.entity.Book;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookForm {

    @NotBlank
    private String isbn;
    @NotBlank
    private String title;

    @NotBlank
    private String author;
//    @NotBlank
//    private String publisher;
    @NotBlank
    private String description;
    @NotBlank
    private boolean available;

    public Book toEntity(){
        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setTitle(title);
//        book.setPublisher(publisher);
        book.setDescription(description);
        book.setAvailable(available);
        return book;
    }
}
