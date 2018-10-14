package com.sac.pattern;

import java.util.Scanner;

public class Triangle6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the no of rows:");
		int n=scn.nextInt();
		int count=1;
		scn.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
