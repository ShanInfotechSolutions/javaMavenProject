package com.shanInfotech.mvnProject.entity;

public class Sim {
	private int serialNumber;
	private long mobileNumber;
	private String networkProvider;
	private Mobile mobile;

	public Sim() {
		// TODO Auto-generated constructor stub
	}

	public Sim(int serialNumber, long mobileNumber, String networkProvider, Mobile mobile) {
		this.serialNumber = serialNumber;
		this.mobileNumber = mobileNumber;
		this.networkProvider = networkProvider;
		this.mobile = mobile;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNetworkProvider() {
		return networkProvider;
	}

	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Sim [serialNumber=" + serialNumber + ", mobileNumber=" + mobileNumber + ", networkProvider="
				+ networkProvider + ", mobile=" + mobile + "]";
	}

}
