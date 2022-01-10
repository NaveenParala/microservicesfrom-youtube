package com.app.naveen.dto;

import com.app.naveen.entity.PassingerInfo;
import com.app.naveen.entity.PaymentInfo;

public class FlightBookingRequest {

	private PassingerInfo passingerInfo;
	private PaymentInfo paymentInfo;
	
	public FlightBookingRequest() {
		super();
	}

	public FlightBookingRequest(PassingerInfo passingerInfo, PaymentInfo paymentInfo) {
		super();
		this.passingerInfo = passingerInfo;
		this.paymentInfo = paymentInfo;
	}

	public PassingerInfo getPassingerInfo() {
		return passingerInfo;
	}

	public void setPassingerInfo(PassingerInfo passingerInfo) {
		this.passingerInfo = passingerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
}
