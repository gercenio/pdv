package com.gaxsoftware.pdv.model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class CompanyAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyaddressid;
	private Company company;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipioid;
	private String municipiods;
	private String estadoid;
	private String estadods;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipioid() {
		return municipioid;
	}
	public void setMunicipioid(String municipioid) {
		this.municipioid = municipioid;
	}
	public String getMunicipiods() {
		return municipiods;
	}
	public void setMunicipiods(String municipiods) {
		this.municipiods = municipiods;
	}
	public String getEstadoid() {
		return estadoid;
	}
	public void setEstadoid(String estadoid) {
		this.estadoid = estadoid;
	}
	public String getEstadods() {
		return estadods;
	}
	public void setEstadods(String estadods) {
		this.estadods = estadods;
	}
	
	@Override
    public String toString() {
        return "CompanyAddress [companyaddressid=" + companyaddressid + ", cep=" + cep
                + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
                + complemento + ",bairro=" + bairro + ",municipioid =" + municipioid 
                + ",municipiods = " + municipiods + ",estadoid=" + estadoid + ",estadods="
                + estadods + "]";
    }
	
}
