package com.brewstation_.brew_station_api.repositories.categories;

import com.brewstation_.brew_station_api.models.category.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, String> {
    Optional<Categories> findByUid(String uid);
}
