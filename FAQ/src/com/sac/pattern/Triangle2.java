package com.sac.pattern;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the no of rows:");
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
