package edu.learn.rest.model;

public class Tax {

	private String status;
	private float weeklySalary;
	private float estimatedYearlySalary;
	private float taxesPaid;
	private float taxRate;
	
	
	public Tax(String status, float weeklySalary, float estimatedYearlySalary, float taxesPaid, float taxRate) {
		super();
		this.status = status;
		this.weeklySalary = weeklySalary;
		this.estimatedYearlySalary = estimatedYearlySalary;
		this.taxesPaid = taxesPaid;
		this.taxRate = taxRate;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(float weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public float getEstimatedYearlySalary() {
		return estimatedYearlySalary;
	}
	public void setEstimatedYearlySalary(float estimatedYearlySalary) {
		this.estimatedYearlySalary = estimatedYearlySalary;
	}
	public float getTaxesPaid() {
		return taxesPaid;
	}
	public void setTaxesPaid(float taxesPaid) {
		this.taxesPaid = taxesPaid;
	}
	public float getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}
	

	
	

}
