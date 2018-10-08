package com.sac.iaq;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=scn.nextInt();
		int flag=0;
		if(n!=0 && n!=1) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println(n+" is not a prime number");
			else
				System.out.println(n+" is a prime number");
		}
		else
			System.out.println(n+" is not a prime number");
		scn.close();
	}

}
