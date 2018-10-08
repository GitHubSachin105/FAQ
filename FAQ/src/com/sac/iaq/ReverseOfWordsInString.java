package com.sac.iaq;

import java.util.Scanner;

public class ReverseOfWordsInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scn.nextLine();
		String[] strArray=str.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			for(int j=strArray[i].length()-1;j>=0;j--) {
				System.out.print(strArray[i].charAt(j));
			}
			System.out.println();
		}
		scn.close();
	}

}
