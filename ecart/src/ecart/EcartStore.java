package ecart;

import java.util.List;

public class EcartStore {

	private int ecareProdNo;
	private ProductDetails productDetails;
	List<ProductDetails> list;
	
	
	

	public EcartStore() {
		super();
	}

	public EcartStore(int ecareProdNo, ProductDetails productDetails) {
		super();
		this.ecareProdNo = ecareProdNo;
		this.productDetails = productDetails;
	}

	public int getEcareProdNo() {
		return ecareProdNo;
	}

	public void setEcareProdNo(int ecareProdNo) {
		this.ecareProdNo = ecareProdNo;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}

	public List<ProductDetails> getList() {
		return list;
	}

	public void setList(List<ProductDetails> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "EcartStore [ecareProdNo=" + ecareProdNo + ", productDetails=" + productDetails + "]";
	}

}
