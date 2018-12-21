package com.sac.iaq;

import java.io.BufferedReader;
import java.util.Scanner;

public class FindLCM {

	public static void main(String[] args) {
		int large=0;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter 1st No:");
		int a=scn.nextInt();
		System.out.print("Enter 2nd No:");
		int b=scn.nextInt();
		scn.close();
		if(a>b)
			large=a;
		else
			large=b;
		while(true) {
			if(large%a==0 && large%b==0){
				System.out.print("LCM of given two numbers:"+large);
				break;
			}
			large++;
		}
		
	}

}
