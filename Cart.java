package shopping.product.cart;


public class Cart 
{
	Product[] products;
	double cartTotal;
	int c=0;
	
	Cart(int size)
	{
		products= new Product[size];
	}
	void addP(int id,String name, double price)
	{
	    products[c]=new Product(id,name,price);
		c++;
	}
	
	double Total()
	{
		cartTotal=0;
		for(int i=0;i<c;i++)
		{
			cartTotal=cartTotal+products[i].price;
		}
		return cartTotal;
	}
}

		