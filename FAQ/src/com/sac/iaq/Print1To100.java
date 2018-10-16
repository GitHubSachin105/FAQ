package com.sac.iaq;

public class Print1To100 {

	public static void main(String[] args) {
			printNumber(1);
	}
	public static void printNumber(int number) {
		if(number <= 100) {
			System.out.println(number);
			number++;
			printNumber(number);			//Note: method calling itself
		}else {
			System.exit(0);
		}
	}

}
