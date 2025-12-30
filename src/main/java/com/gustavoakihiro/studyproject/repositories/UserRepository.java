package com.gustavoakihiro.studyproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoakihiro.studyproject.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	

}
