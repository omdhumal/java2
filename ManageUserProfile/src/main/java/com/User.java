package com;

public class User {
	
	private String username;
	private String userpass;
	private String address;
	private int mono;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMono() {
		return mono;
	}
	public void setMono(int mono) {
		this.mono = mono;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userpass=" + userpass + ", address=" + address + ", mono=" + mono
				+ "]";
	}
	
	

}
