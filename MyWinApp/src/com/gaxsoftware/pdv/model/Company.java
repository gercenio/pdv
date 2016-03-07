package com.gaxsoftware.pdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyid;
	private String description;
	private String cnpj;
	private String ie;
	private String im;
	private String nomefantasia;
	private String singnatureacsat;
	
	@OneToOne
	private CompanyAddress endereco;
	
	@OneToOne
	private Softwarehouse softwarehouse;
	
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getIm() {
		return im;
	}
	public void setIm(String im) {
		this.im = im;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getSingnatureacsat() {
		return singnatureacsat;
	}
	public void setSingnatureacsat(String singnatureacsat) {
		this.singnatureacsat = singnatureacsat;
	}
	public CompanyAddress getEndereco() {
		return endereco;
	}
	public void setEndereco(CompanyAddress endereco) {
		this.endereco = endereco;
	}
	
	public Softwarehouse getSoftwarehouse() {
		return softwarehouse;
	}
	public void setSoftwarehouse(Softwarehouse softwarehouse) {
		this.softwarehouse = softwarehouse;
	}
}
