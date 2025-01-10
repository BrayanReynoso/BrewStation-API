package com.brewstation_.brew_station_api.controllers.categories;

import com.brewstation_.brew_station_api.models.category.Categories;
import com.brewstation_.brew_station_api.services.category.CategoryService;
import com.brewstation_.brew_station_api.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("${API-URL}")
@CrossOrigin("*")
public class CategoriesController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all_categories")
    public ResponseEntity<CustomResponse<List<Categories>>> getAllCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }
}
