package com.company.rewardsplus.model;

public class SignUp {

	private String lName;
	private String fName;
	private String pNumber;
	private String eAddress;
	
	
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
	
	
}
