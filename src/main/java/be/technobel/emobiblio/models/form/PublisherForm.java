package be.technobel.emobiblio.models.form;

import be.technobel.emobiblio.models.entity.Publisher;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PublisherForm {
    @NotBlank
    @Size(max = 100)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String name;

    public Publisher toEntity(){
        Publisher publisher = new Publisher();
        publisher.setId(id);
        publisher.setName(name);
            return publisher;
    }
}
