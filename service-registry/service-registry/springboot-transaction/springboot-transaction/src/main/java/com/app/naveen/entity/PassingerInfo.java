package com.app.naveen.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table(name = "Passinger_Info")
public class PassingerInfo {

	
	@Id
	@GeneratedValue
	@Column(length = 5)
	private Long passinger_Id;
	@Column(length = 15)
	private String passingerName;
	@Column(length = 15)
	private String passingerEmail;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	@Column(length =11 )
	private Date  travelDate;
	@Column(length = 15)
	private String source;
	@Column(length = 15)
	private String destination;
	@Column(length = 10)
	private String pickTime;
	@Column(length = 15)
	private String arrivalTime;
	@Column(length =6 )
	private double fare;
	
	public PassingerInfo() {
		super();
		
	}

	public PassingerInfo(Long passinger_Id, String passingerName, String passingerEmail, Date travelDate, String source,
			String destination, String pickTime, String arrivalTime, double fare) {
		super();
		this.passinger_Id = passinger_Id;
		this.passingerName = passingerName;
		this.passingerEmail = passingerEmail;
		this.travelDate = travelDate;
		this.source = source;
		this.destination = destination;
		this.pickTime = pickTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}

	public Long getPassinger_Id() {
		return passinger_Id;
	}

	public void setPassinger_Id(Long passinger_Id) {
		this.passinger_Id = passinger_Id;
	}

	public String getPassingerName() {
		return passingerName;
	}

	public void setPassingerName(String passingerName) {
		this.passingerName = passingerName;
	}

	public String getPassingerEmail() {
		return passingerEmail;
	}
	
	public void setPassingerEmail(String passingerEmail) {
		this.passingerEmail = passingerEmail;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPickTime() {
		return pickTime;
	}

	public void setPickTime(String pickTime) {
		this.pickTime = pickTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
}
