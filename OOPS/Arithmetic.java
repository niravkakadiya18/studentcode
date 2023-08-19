package oops;
import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First Integer value:");
		int a = sc.nextInt();
		System.out.println("enter Second Integer value:");
		int b = sc.nextInt();
		
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		mod(a,b);
		sc.close();
	}
		static void add(int a , int b)
		{
			System.out.println("Addition: " +(a+b));
		}
		static void sub(int a , int b)
		{
			System.out.println("Subtraction: " +(a-b));
		}
		static void mul(int a , int b)
		{
			System.out.println("Multiplication: " +(a*b));
		}
		static void div(int a , int b)
		{
			System.out.println("Division: " +(a/b));
		}
		static void mod(int a , int b)
		{
			System.out.println("modulus: " +(a+b));
		}
}