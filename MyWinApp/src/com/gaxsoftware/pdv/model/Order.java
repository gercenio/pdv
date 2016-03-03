package com.gaxsoftware.pdv.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "ORDER")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderid;   
	private User user;
    private Status status;
	private double total;
	private Date createdate;
	private Set<OrderItem> itens;
	private Set<OrderPayments> payments;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	public Set<OrderItem> getItens() {
		return itens;
	}
	public void setItens(Set<OrderItem> itens) {
		this.itens = itens;
	}
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	public Set<OrderPayments> getPayments() {
		return payments;
	}
	public void setPayments(Set<OrderPayments> payments) {
		this.payments = payments;
	}
	
	
}
