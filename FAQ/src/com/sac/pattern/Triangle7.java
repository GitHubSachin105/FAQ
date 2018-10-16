package com.sac.pattern;

import java.util.Scanner;

public class Triangle7 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the no of rows:");
		int n=scn.nextInt();
		scn.close();
		int i=0,j=0,k=0;
		for(i=0;i<n;i++) {
			for(j=1;j<=k;j++) {
				System.out.print(" ");
			}
			k=k+1;
			for(j=0;j<2*(n-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
