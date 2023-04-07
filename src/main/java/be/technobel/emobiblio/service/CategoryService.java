package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.CategoryDTO;
import be.technobel.emobiblio.models.entity.Category;

import java.util.List;

public interface CategoryService {

    public List<CategoryDTO> findAllCategories();

    public CategoryDTO findCategoryById(Long id);

    public void createCategory(CategoryDTO category);

    public void updateCategory(CategoryDTO category);

    public void deleteCategory(Long id);
}
