package com.sac.iaq;

import java.util.Scanner;

public class PercentageOfEachTypeChars {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=scn.nextLine();
		double countUpr=0,countLwr=0,countDigit=0,countSpcl=0;
		char[] charArray=str.toCharArray();
		int len=charArray.length;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]>=65 && charArray[i]<=90) 
				countUpr++;
			else if(charArray[i]>=97 && charArray[i]<=122) 
				countLwr++;
			else if(Character.isDigit(charArray[i]))
				countDigit++;
			else
				countSpcl++;
		}
		System.out.println("Percentage of UpperCase:"+(countUpr/len)*100+"%");
		System.out.println("Percentage of LowerCase:"+(countLwr/len)*100+"%");
		System.out.println("Percentage of Digits:"+(countDigit/len)*100+"%");
		System.out.println("Percentage of SpecialCase:"+(countSpcl/len)*100+"%");
		scn.close();
	}

}
