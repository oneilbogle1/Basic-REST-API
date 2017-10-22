package edu.learn.rest.model;

public class Grade {
	
	private String letterGrade;
	private float startRange;
	private float endRange;
	private float qpa;
	
	
	public Grade(String letterGrade, float startRange, float endRange, float qpa) {
		super();
		this.letterGrade = letterGrade;
		this.startRange = startRange;
		this.endRange = endRange;
		this.qpa = qpa;
	}



	public String getLetterGrade() {
		return letterGrade;
	}



	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}



	public float getStartRange() {
		return startRange;
	}



	public void setStartRange(float startRange) {
		this.startRange = startRange;
	}



	public float getEndRange() {
		return endRange;
	}



	public void setEndRange(float endRange) {
		this.endRange = endRange;
	}



	public float getQpa() {
		return qpa;
	}



	public void setQpa(float qpa) {
		this.qpa = qpa;
	}



	
}
