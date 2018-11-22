package com.sac.iaq;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=scn.nextLine();
		scn.close();
		String withOutVowels="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				continue;
			}
			else {
				withOutVowels=withOutVowels+ ch;
			}
		}
		System.out.println("output String:"+withOutVowels);

	}

}
