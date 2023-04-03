package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Category;
import lombok.Data;

@Data
public class CategoryDTO {
    private final Long id;
    private final String name;

    public static CategoryDTO toDTO(Category entity){
        if (entity == null)
            return null;
        return new CategoryDTO(
                entity.getId(),
                entity.getName()
        );
    }
}
