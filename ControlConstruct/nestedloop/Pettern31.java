package com.kn.nestedloop;

public class Pettern31 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(i+j>=5 && j-i<=3) {   // && (i+j)%2!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}