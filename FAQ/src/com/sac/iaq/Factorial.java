package com.sac.iaq;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=scn.nextInt();
		int fact=1;
		if(n>=0) {
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of the number "+n+" is :"+fact);
		}
		else
			System.out.println("please enter positive integer");
	scn.close();
	}

}
