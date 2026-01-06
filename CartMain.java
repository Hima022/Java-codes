package shopping.product.cart;
import java.util.*;
public class CartMain {
	public class ShoppingApp {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();
			Cart c=new Cart(n);
			for(int i=0;i<n;i++)
			{
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				double price=sc.nextDouble();
				c.addP(id,name,price);
			}
			
			System.out.println(c.Total());
			Payment q=new Phonepay();
			q.makePayment(c.Total());
			
			sc.close();
		}
	}
}

	
	
