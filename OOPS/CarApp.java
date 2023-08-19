package oops;

public class CarApp {

	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.color="Black";
		c1.model="BMW";
		c1.manufacturing="ford cars";
		c1.price=5000000;
		System.out.println("Color:" +c1.color);
		System.out.println("Model:" +c1.model);
		System.out.println("Manufacturing:" +c1.manufacturing);
		System.out.println("Price:" +c1.price);

		c1.horn();
		c1.drive();
	}

}
