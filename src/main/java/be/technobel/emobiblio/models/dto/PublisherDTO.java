package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Category;
import be.technobel.emobiblio.models.entity.Publisher;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PublisherDTO {
    private final Long id;
    private final String name;

    public static PublisherDTO toDTO(Publisher entity){
        if (entity == null)
            return null;
    return new PublisherDTO(
            entity.getId(),
            entity.getName()
            );
}
}
