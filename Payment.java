package shopping.product.cart;

public interface Payment {
	void makePayment(double cartTotal);
	default void printrecp() {
		System.out.print("recipet details");
	}
}
	class Gpay implements Payment{
	public void makePayment(double cartTotal)
	{
		System.out.print("gpay"+cartTotal);
		
	}
	}
	class Phonepay implements Payment{
		public void makePayment(double cartTotal)
		{
			System.out.print("Phonepay"+cartTotal);
			
		}

	}


