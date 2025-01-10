package com.brewstation_.brew_station_api.repositories.categories;

import com.brewstation_.brew_station_api.models.category.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, String> {
}
