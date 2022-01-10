package com.naveen.kuamar.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.kuamar.model.Payment;
import com.naveen.kuamar.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;

	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProccess()); 
		payment.setTransaction(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
	
	
	public String paymentProccess() {
		return new Random().nextBoolean()?"success":"Fail";
	}


	public Payment findPaymentHistoryByOrderId(int orderId) {
		
		return paymentRepository.findByOrderId(orderId) ;
	}
}
