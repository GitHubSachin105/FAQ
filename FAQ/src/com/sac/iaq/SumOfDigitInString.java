package com.sac.iaq;

import java.util.Scanner;

public class SumOfDigitInString {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=scn.nextLine();
		getSumOfDigit(str);
		scn.close();
	}
	private static void getSumOfDigit(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isDigit(ch)) {
			sum=sum+Integer.parseInt(String.valueOf(ch));
		}
		}
		if(sum==0)
			System.out.println("sum:-1");
		else
		System.out.println("sum is:"+sum);
	}

}
