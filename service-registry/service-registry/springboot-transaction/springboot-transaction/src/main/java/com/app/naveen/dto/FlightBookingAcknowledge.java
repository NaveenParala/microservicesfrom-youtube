package com.app.naveen.dto;

import com.app.naveen.entity.PassingerInfo;

public class FlightBookingAcknowledge {

	private String status;
	private String pnrNo;
	private double totalFare;
	private PassingerInfo passingerInfo;
	
	public FlightBookingAcknowledge() {
		super();
		
	}
	
	
	public FlightBookingAcknowledge(String status, double totalFare, String pnrNo, PassingerInfo passingerInfo) {
		this.status = status;
		this.pnrNo = pnrNo;
		this.totalFare = totalFare;
		this.passingerInfo = passingerInfo;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPnrNo() {
		return pnrNo;
	}


	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}


	public double getTotalFare() {
		return totalFare;
	}


	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}


	public PassingerInfo getPassingerInfo() {
		return passingerInfo;
	}


	public void setPassingerInfo(PassingerInfo passingerInfo) {
		this.passingerInfo = passingerInfo;
	}

	
	
}
