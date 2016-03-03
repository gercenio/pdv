package com.gaxsoftware.pdv.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
public class Payment {

	private int paymentid;
	private String code;
	private String description;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
