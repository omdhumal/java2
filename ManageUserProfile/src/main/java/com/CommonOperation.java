package com;

import java.util.ArrayList;
import java.util.List;



public class CommonOperation {
	
	public static void listofcustomer() {
		ConnectionProvider cp= new ConnectionProvider();
		ArrayList<Customer> alist = cp.fetchData();
		System.out.println(alist.toString());
	}
	
	
	public static void InsertcustomerRecord() {
		
		Customer customer = new Customer();
		customer.setCustomerName("nitin");
		customer.setAddress("latur");
		customer.setContactNumber(53535353);
		customer.setCountryName("india");
		customer.setGender("male");
		
		ConnectionProvider connp = new ConnectionProvider();
		connp.saveData(customer);
		
		
		
		
		
	}
	
	public static void deleteData(int id) {
		ConnectionProvider conp = new ConnectionProvider();
		conp.deleteDatabyid(id);

	}
	
	public static void updatedata() {
         Customer customer = new Customer();
         customer.setCustomerId(3);
         customer.setCustomerName("sp");
         customer.setGender("female");
         
 		ConnectionProvider conu = new ConnectionProvider();

         conu.updateData(customer);

		
	}
	
	public static void SaveListOfCustomer() {
		
		Customer customer1 = new Customer();
		customer1.setCustomerName("shradha");
		customer1.setAddress("Amravati");
		customer1.setContactNumber(53535353);
		customer1.setCountryName("india");
		customer1.setGender("female");
		
		Customer customer2 = new Customer();
		customer2.setCustomerName("vedant");
		customer2.setAddress("Hingoli");
		customer2.setContactNumber(1081398931);
		customer2.setCountryName("india");
		customer2.setGender("male");
		
		
		Customer customer3 = new Customer();
		customer3.setCustomerName("Ganesh");
		customer3.setAddress("Jalgaon");
		customer3.setContactNumber(455435453);
		customer3.setCountryName("india");
		customer3.setGender("male");
		
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
 		ConnectionProvider conp = new ConnectionProvider();
 		conp.insertList(list);

	}
	
	
	
	public static void main(String[] args) {
		
		//listofcustomer();
		//InsertcustomerRecord();
		//deleteData(6);
		//updatedata();
		//SaveListOfCustomer();
 		ConnectionProvider co = new ConnectionProvider();
          co.getImage(11);
		
	}

}
