package com.sac.iaq;

import java.util.Scanner;

public class FindCombinations {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=scn.nextInt();
		System.out.print("Enter the value of r:");
		int r=scn.nextInt();
		scn.close();
		int factOfN=Factorial(n);
		int factOfNminusR=Factorial(n-r);
		int factOfR=Factorial(r);
		System.out.println("The Combinations is:"+(factOfN/(factOfNminusR*factOfR)));
		
	}
	
	public static int Factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
