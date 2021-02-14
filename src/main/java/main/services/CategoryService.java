package main.services;

import main.entity.Category;
import main.repo.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
   private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void saveCategory(Category category){
        categoryRepository.save(category);
    }
}
