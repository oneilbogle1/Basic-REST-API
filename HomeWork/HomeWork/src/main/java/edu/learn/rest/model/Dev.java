package edu.learn.rest.model;

public class Dev {
	
	private String  devEmail ;
	private String  devFName ;
	private String  devLName ;
	
	
	public Dev(String devEmail, String devFName, String devLName) {
		super();
		this.devEmail = devEmail;
		this.devFName = devFName;
		this.devLName = devLName;
	}
	
	public String getDevEmail() {
		return devEmail;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}
	public String getDevFName() {
		return devFName;
	}
	public void setDevFName(String devFName) {
		this.devFName = devFName;
	}
	public String getDevLName() {
		return devLName;
	}
	public void setDevLName(String devLName) {
		this.devLName = devLName;
	}
	
			
}
