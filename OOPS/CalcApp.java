package oops;
import java.util.Scanner;
public class CalcApp {

	public static void main(String[] args) {
		addition();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 2 numbers for SUBTRACTION:");
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	subtraction(c, d);

    	int product = multiplication();
    	System.out.println("Product = " + product);

    	System.out.println("Enter 2 numbers for DIVISION:");
    	int g = sc.nextInt();
    	int h = sc.nextInt();
   	 	double result = division(g, h);
    	System.out.println("Result = " + result);

	System.out.println("Enter 2 numbers for MODULO:");
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int moduloResult = modulo(x, y);
    	System.out.println("Modulo Result = " + moduloResult);

	double Average = average();
	System.out.println("Average: " + Average);
	sc.close();
}
static void addition() 
{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 2 numbers for ADDITION:");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	System.out.println("Sum = " + (a + b));
    	sc.close();
	}
static void subtraction(int c, int d) 
{
    	System.out.println("Difference = " + (c - d));
	}
static int multiplication() 
{
    	Scanner sc = new Scanner(System.in);
   		 System.out.println("Enter 2 numbers for MULTIPLICATION:");
    	int e = sc.nextInt();
    	int f = sc.nextInt();
    	sc.close();
    	return e * f;

	}
static double division(int g, int h) 
{
    	return (double) g / h;
	}
static int modulo(int x, int y) 
{
    	return x % y;
	}
static double average()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 number for average:");
	int n = sc.nextInt();
	int m = sc.nextInt();
	sc.close();
	return (n + m)/2;

	}
}
