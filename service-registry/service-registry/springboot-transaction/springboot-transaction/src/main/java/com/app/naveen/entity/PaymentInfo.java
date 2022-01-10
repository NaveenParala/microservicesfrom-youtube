package com.app.naveen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Payment_Info")
public class PaymentInfo {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name ="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
	@Column(length =36)
	private String payment_Id;
	@Column(length =10)
	private String accountNo;
	@Column(length = 6)
	private double amount;
	@Column(length = 10)
	private String cardType;
	@Column(length = 5)
	private Long passingerId;
	
	public PaymentInfo() {
		super();
		
	}

	
	public PaymentInfo(String payment_Id, String accountNo, double amount, String cardType, Long passingerId) {
		super();
		this.payment_Id = payment_Id;
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passingerId = passingerId;
	}


	public String getPayment_Id() {
		return payment_Id;
	}


	public void setPayment_Id(String payment_Id) {
		this.payment_Id = payment_Id;
	}


	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Long getPassingerId() {
		return passingerId;
	}
	public void setPassingerId(Long passingerId) {
		this.passingerId = passingerId;
	}
	
	
}
