package com.naveen.kuamar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.kuamar.commons.Payment;
import com.naveen.kuamar.commons.TransactionRequest;
import com.naveen.kuamar.commons.TransactionResponse;
import com.naveen.kuamar.model.Order;
import com.naveen.kuamar.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/bookOrder")
	public TransactionResponse saveOrder(@RequestBody TransactionRequest request) {
	
		return orderService.saveOrder(request);
	}
}
