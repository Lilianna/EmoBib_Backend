package be.technobel.emobiblio.service;

import be.technobel.emobiblio.entity.Category;

import java.util.List;

public class CategoryService {

    public List<Category> findAllCategories();

    public Category findCategoryById(Long id);

    public void createCategory(Category category);

    public void updateCategory(Category category);

    public void deleteCategory(Long id);
}
