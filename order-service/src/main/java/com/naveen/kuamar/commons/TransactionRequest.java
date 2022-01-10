package com.naveen.kuamar.commons;

import com.naveen.kuamar.model.Order;

public class TransactionRequest {

	private Payment	payment;
	private Order order;

	public TransactionRequest() {
		super();

	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}


}
