package com.brewstation_.brew_station_api.services.category;

import com.brewstation_.brew_station_api.models.category.Categories;
import com.brewstation_.brew_station_api.repositories.categories.CategoriesRepository;
import com.brewstation_.brew_station_api.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
  private final CategoriesRepository categoryRepository;

    @Autowired
    public CategoryService(CategoriesRepository categoriesRepository) {
        this.categoryRepository = categoriesRepository;
    }

    @Transactional(readOnly = true)
    public CustomResponse<List<Categories>> getAllCategories() {
        List<Categories> categories = categoryRepository.findAll();
        if (!categories.isEmpty()) {
           return new CustomResponse<>();
        }
        return new CustomResponse<>();

    }
}
