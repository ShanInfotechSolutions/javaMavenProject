package com.shanInfotech.mvnProject.entity;

public class Mobile {
	private int imeiNumber;
	private String mobileCmpany;
	
	public Mobile() {
	}

	public Mobile(int imeiNumber, String mobileCmpany) {
		this.imeiNumber = imeiNumber;
		this.mobileCmpany = mobileCmpany;
	}

	public int getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(int imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public String getMobileCmpany() {
		return mobileCmpany;
	}

	public void setMobileCmpany(String mobileCmpany) {
		this.mobileCmpany = mobileCmpany;
	}

	@Override
	public String toString() {
		return "Mobile [imeiNumber=" + imeiNumber + ", mobileCmpany=" + mobileCmpany + "]";
	}
	

}
