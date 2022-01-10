package com.app.naveen.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.naveen.dto.FlightBookingAcknowledge;
import com.app.naveen.dto.FlightBookingRequest;
import com.app.naveen.entity.PassingerInfo;
import com.app.naveen.entity.PaymentInfo;
import com.app.naveen.repository.PassingerInfoRepository;
import com.app.naveen.repository.PaymentInfoRepository;
import com.app.naveen.util.PaymentUtil;

@Service
public class FlightBookingService {
	@Autowired
	private PassingerInfoRepository passingerInfoRepository;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;

	@Transactional
	//(readOnly = false,isolation =  Isolation.READ_COMMITTED,
			        // propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledge bookingAcknowledge(FlightBookingRequest request) {

		PassingerInfo passingerInfo=request.getPassingerInfo();
		passingerInfo=passingerInfoRepository.save(passingerInfo);
		PaymentInfo paymentInfo=request.getPaymentInfo();
		
		PaymentUtil.validatePayment(paymentInfo.getAccountNo(),passingerInfo.getFare());
		paymentInfo.setPassingerId(passingerInfo.getPassinger_Id());
		paymentInfo.setAmount(passingerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		return new FlightBookingAcknowledge("SUCCESS",passingerInfo.getFare(),
				                              UUID.randomUUID().toString().split("-")[0], passingerInfo);
	}

}
