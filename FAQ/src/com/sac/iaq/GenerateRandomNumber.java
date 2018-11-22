package com.sac.iaq;

import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the no of digit we required:");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			int a=(int)(Math.random()*10);
			System.out.print(a);
		}
		scn.close();
	}

}
