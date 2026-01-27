package com.product.inventory;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	public List<Product> inventory;

	ProductService() {
		inventory = new ArrayList<Product>();

	}

	public void addProduct(Product p) {
		inventory.add(p);
	}
	boolean searchProduct(int pid) {
			boolean found=false;
			for(Product p:inventory) {
				if(p.getPid()==pid) {
					found=true;
				}
				System.out.println(p);
				break;
		
					
			}
		
			return found;	
		}

	public void dispaly() {
		System.out.println(inventory);
	}

}
