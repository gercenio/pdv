package com.gaxsoftware.pdv.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
private int productid;
private String description;
private String code;
private String ucom;
private double vcom;
private double valiquotaicms;
private double valiquotapis;
private double valiquotacofins;
private double valiquotaipi;
private Date createdate;

public int getProductid() {
	return productid;
}

public void setProductid(int productid) {
	this.productid = productid;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
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

public Date getCreatedate() {
	return createdate;
}

public void setCreatedate(Date createdate) {
	this.createdate = createdate;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getValiquotaicms() {
	return valiquotaicms;
}

public void setValiquotaicms(double valiquotaicms) {
	this.valiquotaicms = valiquotaicms;
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

public double getValiquotaipi() {
	return valiquotaipi;
}

public void setValiquotaipi(double valiquotaipi) {
	this.valiquotaipi = valiquotaipi;
}

}
