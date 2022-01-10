package com.app.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.naveen.dto.FlightBookingAcknowledge;
import com.app.naveen.dto.FlightBookingRequest;
import com.app.naveen.service.FlightBookingService;

@SpringBootApplication
@RestController
@RequestMapping("/transaction")
@EnableTransactionManagement
public class SpringbootTransactionApplication {
    @Autowired
	private FlightBookingService bookingService;
	
	@PostMapping("/bookTicket")
	public FlightBookingAcknowledge bookingAcknowledge(@RequestBody FlightBookingRequest request) {
		return bookingService.bookingAcknowledge(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionApplication.class, args);
	}

}
