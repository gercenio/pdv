package com.gaxsoftware.pdv.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATUS")
public class Status {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int statusid;
	private String statusds;
	
	public int getStatusid() {
		return statusid;
	}
	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}
	public String getStatusds() {
		return statusds;
	}
	public void setStatusds(String statusds) {
		this.statusds = statusds;
	}

	
}
