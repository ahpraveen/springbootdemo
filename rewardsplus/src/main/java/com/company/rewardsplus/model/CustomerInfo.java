package com.company.rewardsplus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String lName;
	private String fName;
	private String pNumber;
	private String eAddress;
	private String uName;
	private String uPassword;
	
	
	public void setlName(String strlName){
		this.lName = strlName;
	}
	
	public String getlName(){
		return this.lName;
	}
	
	public void setfName(String firstName){
		this.fName = firstName;
	}
	
	public String getfName(){
		return this.fName;
	}
	
	public void setpNumber(String pNumber){
		this.pNumber = pNumber;
	}
	
	public String getpNumber(){
		return this.pNumber;
	}
	
	public void seteAddress(String eAddress){
		this.eAddress = eAddress;
	}
	
	public String geteAddress(){
		return this.eAddress;
	}
	
	public void setuName(String uName){
		this.uName = uName;
	}
	
	public String getuName(){
		return this.uName;
	}
	
	public void setuPassword(String uPassword){
		this.uPassword = uPassword;
	}
	
	public String getuPassword(){
		return this.uPassword;
	}
	
}
