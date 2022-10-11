package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Blob;

import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class ConnectionProvider {
	
	public static ArrayList<Customer> fetchData() {
		
		ArrayList<Customer> listofcustomer = new ArrayList();
		Statement stmt = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Dhumal@123");

			 stmt =   conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from b19.user"); 
			
			while(rs.next()) {
				Customer customer = new Customer();
				
				customer.setCustomerId(rs.getInt("id"));
				customer.setCustomerName(rs.getString("name"));
				customer.setContactNumber(rs.getInt("number"));
				customer.setAddress(rs.getString("address"));
				customer.setGender(rs.getString("gender"));
				customer.setCountryName(rs.getString("city"));
				
				listofcustomer.add(customer);
				
			}
			
		}catch(Exception e) {
			
		}
		return listofcustomer;
		}

	public void saveData(Customer customer) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Dhumal@123");
			PreparedStatement pstmt = conn.prepareStatement("insert into user(name,number,address,gender,city,imagename,image)values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setInt(2, customer.getContactNumber());
			pstmt.setString(3, customer.getAddress());
			pstmt.setString(4, customer.getGender());
			pstmt.setString(5, customer.getCountryName());
			pstmt.setString(6, "photo");

			FileInputStream fis = new FileInputStream("C:\\Users\\old19\\OneDrive\\Desktop\\abc.bmp");
			
			pstmt.setBinaryStream(7, fis, fis.available());

			 int i=pstmt.executeUpdate();
			 System.out.println("i"+i);
			
			
		}catch(Exception e){
		e.printStackTrace();
	}


}

	public void deleteDatabyid(int id) {
	     try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Dhumal@123");
			PreparedStatement pstmt = conn.prepareStatement("delete from b19.user where id ="+id+"");
				int rs = pstmt.executeUpdate();
		
				System.out.println("id"+id+"");
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }
		
	}
	
	public void updateData(Customer customer) {
		try {
			 int i = getConnection().executeUpdate("update user set name='"+customer.getCustomerName()+"',gender='"+customer.getGender()+"' where id="+customer.getCustomerId()+"");
			 System.out.println("i ="+i);
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
	}
	
	public static Statement getConnection() {
		Statement stmt = null;
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Dhumal@123");
		  stmt = conn.createStatement();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}

	public void insertList(List<Customer> list) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Dhumal@123");
			PreparedStatement pstmt = conn.prepareStatement("insert into user(name,number,address,gender,city)values(?,?,?,?,?)");
			for(Customer customer:list) {
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setInt(2, customer.getContactNumber());
			pstmt.setString(3, customer.getAddress());
			pstmt.setString(4, customer.getGender());
			pstmt.setString(5, customer.getCountryName());

			 int i=pstmt.executeUpdate();
			 System.out.println("i"+i);
			
			}
		}catch(Exception e){
		e.printStackTrace();
	}

		
		
		
	}
	
	public void getImage(int id) {
		Statement stmt = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Dhumal@123");
               stmt =   conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select imagename ,image from user where id="+id+""); 
			

			while(rs.next()) {
				System.out.println(rs.getString("imagename"));
				Blob bb =(Blob) rs.getBlob("image");
				byte ba[] = bb.getBytes(1, (int)bb.length());
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\old19\\OneDrive\\Desktop\\om.jpg");
				fos.write(ba);
				fos.close();
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}

	}}
