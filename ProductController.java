package com.product.inventory;
import java.util.*;

public class ProductController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductService inventory=new ProductService();
		System.out.println("1.add the product");
		System.out.println("2.search the product");
		System.out.println("3.remove product");
		
		int n=sc.nextInt();
		int a;
		switch(n){
		
			case 1:
			
				a=sc.nextInt();
				System.out.println("Enter Products to be added"+a);
				for(int i=0;i<n;i++) {
					int pid=sc.nextInt();
					String pname=sc.nextLine();
					double price=sc.nextDouble();
					int quantity=sc.nextInt();
					Product p=new Product(pid,pname,price,quantity);
					inventory.addProduct(p);
					
	                System.out.println("Product added.");
	                break;
					
				}
                
		}
			

	}

}
