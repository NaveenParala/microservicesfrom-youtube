package com.naveen.kuamar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.kuamar.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
