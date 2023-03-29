package ecart;

import java.util.Scanner;

public class Ecart {
	
	public Customer userdatails() {
		
		System.out.println("login with your credentials:");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.nextLine();
		
		String adress=sc.nextLine();
		Customer customer = new Customer();
		customer.setCustomerName(name);
		customer.setCustomerAddress(adress);
		return customer;
		
		
	}
	
	public void productDetails() {
		Scanner sca = new Scanner(System.in);

		
		System.out.println("Enter product Details:");
		System.out.println("enter product id");
		int productid=sca.nextInt();
		
		ProductDetails productDetails = new ProductDetails();
		
		productDetails.setProductId(productid);
		
		System.out.println("product added successfully");
		System.out.println(productDetails);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Ecart e = new Ecart();
		Customer c=e.userdatails();
		System.out.println(c);
		e.productDetails();
		
	}

}
