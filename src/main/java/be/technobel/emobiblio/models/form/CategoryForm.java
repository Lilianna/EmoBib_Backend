package be.technobel.emobiblio.models.form;

import be.technobel.emobiblio.models.entity.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoryForm {
    @NotBlank
    @Size(max = 100)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String name;

    public Category toEntity(){
        Category category = new Category();
        category.setId(id);
        category.setName(name);
        return category;
    }

}
