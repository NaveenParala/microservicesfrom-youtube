package com.app.naveen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	
	@RequestMapping("/orderFallBack")
	public Mono<String> orderFallback(){
		return Mono.just("Order service too long time to give respnse it is under maintainance");
	}

	@RequestMapping("/paymentFallBack")
	public Mono<String> paymentFallback() {
		
		return Mono.just("the payment service take too long time as much you expected get soon with quicker response");
	}
	
}
