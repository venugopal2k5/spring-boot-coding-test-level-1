package com.codejam.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONAL_INFORMATION")
public class PersonalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="REAL_NAME")
	String realName;
	
	@Column(name="IDOL_NAME")
	String idolName;
	
	@Column(name="ADDRESS")
	String address;
	
	@Column(name="IDOL_STATUS")
	String idolStatus;
	
	public PersonalInfo() {
		
	}

	public PersonalInfo(Integer id, String realName, String idolName,String address, String idolStatus) {
		this.id=id;
		this.realName=realName;
		this.idolName=idolName;
		this.address=address;
		this.idolStatus=idolStatus;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdolName() {
		return idolName;
	}

	public void setIdolName(String idolName) {
		this.idolName = idolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdolStatus() {
		return idolStatus;
	}

	public void setIdolStatus(String idolStatus) {
		this.idolStatus = idolStatus;
	}

	
}
