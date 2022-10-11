package com;

public class User2 {
	private int userid;
	private String username;
	private String password;
	private String mobileno;
	private String address;
	
	
	public User2() {
		super();
	}
	
	public User2(int userid, String username, String password, String mobileno, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.address = address;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String string) {
		this.mobileno = string;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User2 [userid=" + userid + ", username=" + username + ", password=" + password + ", mobileno="
				+ mobileno + ", address=" + address + "]";
	}
	public Object getUserpass() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
