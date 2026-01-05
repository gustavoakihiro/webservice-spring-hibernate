package com.gustavoakihiro.studyproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoakihiro.studyproject.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
