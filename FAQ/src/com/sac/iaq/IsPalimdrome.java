package com.sac.iaq;

import java.util.Scanner;

public class IsPalimdrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=scn.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+ str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("Given string is Palimdrome");
		else
			System.out.println("Given string is not Palimdrome");
		scn.close();

	}

}
