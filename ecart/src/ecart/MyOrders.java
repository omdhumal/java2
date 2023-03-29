package ecart;

import java.util.ArrayList;
import java.util.List;

public class MyOrders {

	public EcartStore addProduct() {

		ProductDetails p1 = new ProductDetails(1, "trimmer", "999", "black");
		ProductDetails p2 = new ProductDetails(2, "bluetooth", "1999", "gray");
		ProductDetails p3 = new ProductDetails(3, "hedset", "1200", "blue");
		ProductDetails p4 = new ProductDetails(4, "laptop", "50000", "silver");
		
		List<ProductDetails> list = new ArrayList<ProductDetails>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
		// calculate sum of all ekart products.
		
	long a = list.stream().mapToInt((p)->Integer.valueOf(p.getProductPrice())).sum();
	
	
		
	System.out.println("total count:"+a);
		
		EcartStore e  = new EcartStore();
		e.setList(list);
		
		return e;
		
		
		

//
//		List<EcartStore> listOfProduct = new ArrayList<EcartStore>();
//
//		EcartStore es1 = new EcartStore(1, p1);
//		EcartStore es2 = new EcartStore(2, p2);
//		EcartStore es3 = new EcartStore(3, p3);
//		EcartStore es4 = new EcartStore(4, p4);
//
//		listOfProduct.add(es1);
//		listOfProduct.add(es2);
//		listOfProduct.add(es3);
//		listOfProduct.add(es4);
//
//		return listOfProduct;

	}

	public static void main(String[] args) {

		MyOrders myorders = new MyOrders();
		
		EcartStore ecart = myorders.addProduct();
		
		
		
		

	}

}
