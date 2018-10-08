package com.sac.iaq;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=scn.nextLine();
		String[] strArray=str.split(" ");
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]+" ");
		}

		
		scn.close();
	}

}
