package oops;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Integer no:");
		int a = sc.nextInt();
		System.out.println("enter the Double no:");
		double d = sc.nextDouble();
		double res=a+d;
		System.out.println("Addition=" +res);
		
		sc.close();
	}

}