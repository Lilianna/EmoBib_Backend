package be.technobel.emobiblio.models.form;

import be.technobel.emobiblio.models.entity.Author;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AuthorForm {

    @NotBlank
    private String name;
    @NotBlank
    private String description;

    public Author toEntity(){
        Author author = new Author();
        author.setName(name);
        author.setDescription(description);
        return author;
    }

}
