package com.sac.iaq;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=scn.next();
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+ str.charAt(i);
		}
		scn.close();
		System.out.println("Reverse String:"+revStr);

	}

}
