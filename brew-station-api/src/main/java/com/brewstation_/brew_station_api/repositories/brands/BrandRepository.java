package com.brewstation_.brew_station_api.repositories.brands;

import com.brewstation_.brew_station_api.models.brand.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brands, String> {

    Optional<Brands> findByName(String name);
}
