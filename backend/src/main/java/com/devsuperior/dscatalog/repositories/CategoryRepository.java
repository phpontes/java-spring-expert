package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
