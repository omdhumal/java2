package com;

import java.util.List;

public class LoginService {

	public boolean verifyUserCredentials(String username, String password) {
		
		LoginDbConnection ldbc = new LoginDbConnection();
		
		User2 userfrDB= ldbc.getusername(username);
		
		if(userfrDB.getPassword()!=null && userfrDB.getUsername().equalsIgnoreCase(username) && userfrDB.getPassword().equalsIgnoreCase(password)) {
		return true;
	}else {
		
		return false;
	}

	}
	public boolean storedata(User2 user2) throws Exception {
		LoginDbConnection lc= new LoginDbConnection();
		
			int b=lc.connectiontostoredata(user2);
			
			if(b>0) {
				return true;
				
			
		} 
			else {
				
				return false;
			}
  
	}
	public List<User2> showdata() throws Exception {
		
		
		LoginDbConnection lbd= new LoginDbConnection();
		List lt=lbd.showdata();
		return lt;

	}
	public boolean deletedatas(int userid) throws Exception {
		
		LoginDbConnection dd= new LoginDbConnection();
	
		boolean flag	=dd.deleteData(userid);
		
		return flag;
		

		
	}
	
	public User2 getdata(int userid) {
		LoginDbConnection dd= new LoginDbConnection();

		User2 usr=dd.getUserDatabyid(userid);
		return usr;
		
	}
	public boolean UpdatedData(User2 user) {
		LoginDbConnection dd= new LoginDbConnection();
		boolean ab=dd.dataupdated(user);
		return ab;
		
	}
	
}
