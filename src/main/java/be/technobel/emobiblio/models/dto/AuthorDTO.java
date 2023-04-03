package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Author;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorDTO {
    private Long id;
    private String name;
    private String description;

    public static AuthorDTO from (Author entity){
        if(entity == null)
            return null;
        return AuthorDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .build();
    }

}
