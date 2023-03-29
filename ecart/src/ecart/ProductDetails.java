package ecart;

public class ProductDetails {

	private int productId;
	private String productName;
	private String productPrice;
	private String productColor;

	public ProductDetails() {
		super();
		
	}

	public ProductDetails(int productId, String productName, String productPrice, String productColor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productColor=" + productColor + "]";
	}

}
