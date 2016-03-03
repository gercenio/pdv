package com.gaxsoftware.pdv.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERITEM")
public class OrderItem {

	public OrderItem(){
		
	}
	
	public int getOrderitemid() {
		return orderitemid;
	}
	public void setOrderitemid(int orderitemid) {
		this.orderitemid = orderitemid;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getUcom() {
		return ucom;
	}

	public void setUcom(String ucom) {
		this.ucom = ucom;
	}

	public double getVcom() {
		return vcom;
	}

	public void setVcom(double vcom) {
		this.vcom = vcom;
	}

	public double getQcom() {
		return qcom;
	}

	public void setQcom(double qcom) {
		this.qcom = qcom;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@ManyToOne
	@JoinColumn(name = "orderid")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public double getVicms() {
		return vicms;
	}

	public void setVicms(double vicms) {
		this.vicms = vicms;
	}

	public double getVipi() {
		return vipi;
	}

	public void setVipi(double vipi) {
		this.vipi = vipi;
	}

	public double getVcofins() {
		return vcofins;
	}

	public void setVcofins(double vcofins) {
		this.vcofins = vcofins;
	}

	public double getVpis() {
		return vpis;
	}

	public void setVpis(double vpis) {
		this.vpis = vpis;
	}

	public double getValiquotaicms() {
		return valiquotaicms;
	}

	public void setValiquotaicms(double valiquotaicms) {
		this.valiquotaicms = valiquotaicms;
	}

	public double getValiquotaipi() {
		return valiquotaipi;
	}

	public void setValiquotaipi(double valiquotaipi) {
		this.valiquotaipi = valiquotaipi;
	}

	public double getValiquotapis() {
		return valiquotapis;
	}

	public void setValiquotapis(double valiquotapis) {
		this.valiquotapis = valiquotapis;
	}

	public double getValiquotacofins() {
		return valiquotacofins;
	}

	public void setValiquotacofins(double valiquotacofins) {
		this.valiquotacofins = valiquotacofins;
	}

	public String getCodcst() {
		return codcst;
	}

	public void setCodcst(String codcst) {
		this.codcst = codcst;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderitemid;
	private Product product;
	private Order order;
	private String ucom;
	private double vcom;
	private double qcom;
	private double vicms;
	private double vipi;
	private double vcofins;
	private double vpis;
	private double valiquotaicms;
	private double valiquotaipi;
	private double valiquotapis;
	private double valiquotacofins;
	private String codcst;
	private Date createdate;


}
