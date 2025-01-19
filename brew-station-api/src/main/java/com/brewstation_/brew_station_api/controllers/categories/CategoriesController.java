package com.brewstation_.brew_station_api.controllers.categories;

import com.brewstation_.brew_station_api.models.category.Categories;
import com.brewstation_.brew_station_api.services.category.CategoryService;
import com.brewstation_.brew_station_api.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/category/get-by-uid/{uid}")
    public ResponseEntity<CustomResponse<Categories>> getByUid(@PathVariable("uid") String uid) {
        return  new ResponseEntity<>(
                categoryService.getCategoryById(uid), HttpStatus.OK
        );
    }

    @PostMapping("/category")
    public ResponseEntity<CustomResponse<Categories>> saveCategory(@RequestBody Categories category) {
        return new ResponseEntity<>(
                this.categoryService.saveCategory(category), HttpStatus.CREATED
        );
    }

    @PutMapping("/category/update/{uid}")
    public ResponseEntity<CustomResponse<Categories>> updateCategory(@PathVariable("uid") String uid,@RequestBody Categories category) {
        return  new ResponseEntity<>(
                this.categoryService.updateCategory(uid,category), HttpStatus.OK
        );
    }

}
