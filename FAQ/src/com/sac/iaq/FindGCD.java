package com.sac.iaq;

import java.util.Scanner;
//to find the greatest common divisor (GCD) 
public class FindGCD {

	public static void main(String[] args) {
		int small=0;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first no:");
		int a=scn.nextInt();
		System.out.print("Enter second no:");
		int b=scn.nextInt();
		scn.close();
		if(a>b)
			small=b;
		else
			small=a;
		for(int i=small;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				System.out.print("The GCD of given two numbers is: "+i);
				break;
			}
		}
	}

}
