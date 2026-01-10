package com.gustavoakihiro.studyproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoakihiro.studyproject.entities.OrderItem;
import com.gustavoakihiro.studyproject.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
