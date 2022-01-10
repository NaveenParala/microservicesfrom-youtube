package com.naveen.kuamar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.naveen.kuamar.commons.Payment;
import com.naveen.kuamar.commons.TransactionRequest;
import com.naveen.kuamar.commons.TransactionResponse;
import com.naveen.kuamar.model.Order;
import com.naveen.kuamar.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest request) {
    	String response="";
		Order order =null;
	    order=request.getOrder(); 
		Payment payment=request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice()); 
	    Payment paymentResponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment",
	    		                                            payment,Payment.class);
	    response=paymentResponse.getPaymentStatus().equals("success")?"payment success":"payment got failure";
		orderRepository.save(order); 
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}
}
