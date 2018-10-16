package com.sac.iaq;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=scn.nextInt();
		scn.close();
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count=count+i;
			}
		}
		if(n==count)
			System.out.println(n+" is the perfect number");
		else
			System.out.println(n+" is not perfect number");

	}

}
