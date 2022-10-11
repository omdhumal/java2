package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class LoginDbConnection {
	
	public User2 getusername(String username) {
		//User2 user= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b15","root","Dhumal@123")	;
			
			PreparedStatement pstmt = conn.prepareStatement("select * from userb where username=?");
			pstmt.setString(1, username);
			ResultSet rs =  pstmt.executeQuery();

			User2 user = new User2();
			while(rs.next()) {
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			return user;

			
		} catch (Exception e) {
			User2 user = new User2();
			e.printStackTrace();
			return user;
		}
		//return user;
		
		
	}
	public int connectiontostoredata(User2 user2) throws Exception {
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b15","root","Dhumal@123")	;
			
			PreparedStatement pstmt = conn.prepareStatement("insert into userb values(?,?,?,?,?)");
		    pstmt.setInt(1,user2.getUserid());
			pstmt.setString(5,user2.getUsername());
			pstmt.setString(2, user2.getPassword());
			pstmt.setString(4, user2.getAddress());
			pstmt.setString(3, user2.getMobileno());
			
			
			int rs=pstmt.executeUpdate();
			return rs;	
		
	}
	public List<User2 > showdata() throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b15","root","Dhumal@123")	;
			
			PreparedStatement pstmt = conn.prepareStatement("select * from userb ");
			
			ResultSet rs =  pstmt.executeQuery();
			List<User2 > list =new ArrayList<>();

			while(rs.next()) {
				User2 user = new User2();

			user.setUserid(rs.getInt("userid"));
			user.setUsername(rs.getString("username"));
			user.setMobileno(rs.getString("mobileno"));
			user.setPassword(rs.getString("password"));
			user.setAddress(rs.getString("address"));
		
			list.add(user);
         System.out.println();
	
		
			}
			return list;
	}
	
	public boolean deleteData(int userid) throws Exception {
	

	Class.forName("com.mysql.cj.jdbc.Driver");
	User2 useri;
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b15","root","Dhumal@123")	;
			
			PreparedStatement pstmt = conn.prepareStatement("delete from userb where userid=?");
			pstmt.setInt(1,userid);
			int rs =  pstmt.executeUpdate();
			
	
				
			if (rs>0) {
				return true;

			}else {
				return false;
			}
	}
	
	public User2 getUserDatabyid(int userid) {
		User2 useri = new User2();

		try {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b15","root","Dhumal@123")	;
				
				PreparedStatement pstmt = conn.prepareStatement("select * from userb where userid=?");
				pstmt.setInt(1,userid);
				 ResultSet rs =  pstmt.executeQuery();
				while(rs.next()) {
					useri.setUserid(rs.getInt("userid"));
					useri.setUsername(rs.getString("username"));
					useri.setMobileno(rs.getString("mobileno"));
					useri.setPassword(rs.getString("password"));
					useri.setAddress(rs.getString("address"));
				
						
				}return useri;
		
		
		}catch(Exception e) {
			e.printStackTrace();
		
	}
		return useri;
			
	

		
	}
	public  boolean dataupdated(User2 user) {
		try {
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b15","root","Dhumal@123")	;
			
			PreparedStatement pstmt = conn.prepareStatement("update userb set password=?,mobileno=?,address=?,username=? where userid =?");
		    pstmt.setInt(5,user.getUserid());
			pstmt.setString(4,user.getUsername());
			pstmt.setString(1, user.getPassword());
			pstmt.setString(3, user.getAddress());
			pstmt.setString(2, user.getMobileno());
			
				int rs=pstmt.executeUpdate();
				if(rs>0) {
					
					return true;
				}else {
					return false;
				}
				
			} catch (Exception e) {
		
				e.printStackTrace();
			}
			return false;	
		
		
		
	}
	}

