package com.naveen.kuamar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.kuamar.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);

}
