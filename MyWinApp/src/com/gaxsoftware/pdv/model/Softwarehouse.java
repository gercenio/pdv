package com.gaxsoftware.pdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOFTWAREHOUSE")
public class Softwarehouse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int softwarehouseid;
	private String description;
	private String document;
	public int getSoftwarehouseid() {
		return softwarehouseid;
	}
	public void setSoftwarehouseid(int softwarehouseid) {
		this.softwarehouseid = softwarehouseid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	
}
