package com.example.DecorEcomerceProject.Service;


import com.example.DecorEcomerceProject.Entities.Category;
import com.example.DecorEcomerceProject.ViewModels.ProductWithCategoryVM;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Category createCategory(Category category);

    List<Category> getAllCategories();
    Optional<Category> getCategoryByID(long id);

    String deleteCategory(Long id);

    Category updateCategory(Long id, Category category);
}
