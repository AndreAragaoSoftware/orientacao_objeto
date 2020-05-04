package entities;

import java.util.Date;

public class Order {
	
	private Date date;
	private Product product;
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		// quando o atriduto n tem private nem publique ele pode ser alterado
		// desde que esteja no mesmo pacote
		this.product.name = "TV";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
