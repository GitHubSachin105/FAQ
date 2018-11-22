package com.sac.iaq;

import java.util.Scanner;

public class PrintMirrorPattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter no:");
		int n=scn.nextInt();
		scn.close();
		printMirror(n);

	}
	public static void printMirror(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i>j)
					System.out.print(i+"*");
				else
					System.out.print(i);
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i>j)
					System.out.print(i+"*");
				else
					System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
