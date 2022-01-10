package com.app.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.naveen.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {

}
