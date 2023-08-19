package oops;

public class ProductApp {

	public static void main(String[] args) {
		Product p1=new Product();
		Product1 p2=new Product1();
	
		p1.product_id=212;
		p1.product_category="clothing";
		p1.price=234;
		System.out.println("Product Id:" + p1.product_id);
		System.out.println("Product Category:" + p1.product_category);
		System.out.println("Price:" + p1.price);
		p1.manufacturing();
		p1.sold();
		p1.shipped();
	
		p2.product_id=454;
		p2.product_category="Gaming";
		p2.price=5000;
		System.out.println("Product Id:" + p2.product_id);
		System.out.println("Product Category:" + p2.product_category);
		System.out.println("Price:" + p2.price);
		p2.manufacturing();
		p2.sold();
		p2.shipped();
	}

}
