package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Author;
import be.technobel.emobiblio.models.entity.Book;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDTO {
    private final Long id;
    private final String isbn;
//    private final String name;
//    private String serialName;
    private String title;
    private String description;
    private boolean available;


public static BookDTO from (Book entity) {
    if (entity == null)
        return null;
    return BookDTO.builder()
            .id(entity.getId())
            .isbn(entity.getIsbn())
            .title(entity.getTitle())
            .description(entity.getDescription())
            .available(entity.isAvailable())
            .build();
    }

}
