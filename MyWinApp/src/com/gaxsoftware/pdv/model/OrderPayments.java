package com.gaxsoftware.pdv.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERPAYMENTS")
public class OrderPayments {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderpaymentid;
	private double value;
	private Date createdate;
	private Order order;
	private Payment payment;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	

}
