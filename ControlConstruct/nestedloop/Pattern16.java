package com.kn.nestedloop;

public class Pattern16 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i>=j) {
					System.out.print(k);
					k++;
				}
			}
			System.out.println("");
		}
	}

}
