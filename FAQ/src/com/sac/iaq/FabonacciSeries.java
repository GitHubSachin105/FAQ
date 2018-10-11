package com.sac.iaq;

import java.util.Scanner;

public class FabonacciSeries {
	private static int a=0,b=1,c;
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the range:");		
		int n=scn.nextInt();
		System.out.println();
		System.out.print(a+","+b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
		}
		scn.close();

	}

}
