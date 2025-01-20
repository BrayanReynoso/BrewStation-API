package com.brewstation_.brew_station_api.models.brand;

import com.brewstation_.brew_station_api.models.category.Categories;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "brand")
public class Brands {

    @Id
    @UuidGenerator
    @Column(name = "uid")
    private String uid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;
    @Column(name = "last_modified", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp lastModified;

    @ManyToMany
    @JoinTable(
            name = "brand_category",
            joinColumns = @JoinColumn(name = "brand_uid"),
            inverseJoinColumns = @JoinColumn(name = "category_uid")
    )
    private Set<Categories> categories;

}
