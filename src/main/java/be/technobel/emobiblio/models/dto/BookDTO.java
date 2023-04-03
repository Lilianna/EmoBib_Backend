package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Book;
import lombok.Data;

@Data
public class BookDTO {
    private final Long id;
    private final String isbn;
    private final String name;
    private String serialName;
    private String description;


public static BookDTO toDTO(Book entity) {
    if (entity == null)
        return null;
    return new BookDTO(entity.getId(), entity.getIsbn(), entity.getName());
}

}
