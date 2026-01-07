package com.gustavoakihiro.studyproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoakihiro.studyproject.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
