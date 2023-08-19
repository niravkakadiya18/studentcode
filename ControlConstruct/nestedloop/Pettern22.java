package com.kn.nestedloop;

public class Pettern22 {

	public static void main(String[] args) {
		 for(int i=1;i<=9;i++) {
			 for(int j=1;j<=9;j++) {
				if((i-j<=0 && i+j<=10) || (i+j>=10 && i-j>=0)) {
					if(i<=5) {
						System.out.print((char)(i+64));
					}else {
						System.out.print((char)(74-i));
					}
					
				}else {
					System.out.print(" ");
				}
			 }
			 System.out.println("");
		 }
	}

}
