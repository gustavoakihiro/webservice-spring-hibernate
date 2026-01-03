package com.gustavoakihiro.studyproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoakihiro.studyproject.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
