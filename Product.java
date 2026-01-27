package com.product.inventory;

public class Product {
	int pid;
	String pname;
	double price;
	int quantity;

	public Product(int pid, String pname, double price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
