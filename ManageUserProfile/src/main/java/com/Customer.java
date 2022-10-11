package com;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int contactNumber;
	private String address;
	private String gender;
	private String countryName;
	
	
	
	public Customer(String customerName, int contactNumber, String address, String gender, String countryName) {
		super();
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.gender = gender;
		this.countryName = countryName;
	}
	
	
	public Customer() {
		super();
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber (int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", address=" + address + ", gender=" + gender + ", countryName=" + countryName + "]";
	}
	
	
	
	


	

}
