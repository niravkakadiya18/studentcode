package com.kn.whileloop;

import java.util.Scanner;

public class Series9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any series number:-");
		int num=sc.nextInt();
		 
		double num1=findSeriesSum(num);
		System.out.println("series is " +num1);
		sc.close();
		
	}

 static double findSeriesSum(int num) {
	 double i=1, sum=0.0;
	 while(i<=num)
//	 for(double i=1;i<=num;i++)
	 {
		 sum=sum+1/i;
		 i++;
	 }
		return sum;
		
	}

}
