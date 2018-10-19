package com.sac.exceptions;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {
		try {
			//BankATM acc1=new SBIBankATM();
			Scanner scn=new Scanner(System.in);
			System.out.print("Swipe your ATM card:");
			String cardName=scn.next();
			Class cls=Class.forName(cardName);
			Object obj=cls.newInstance();
			BankATM acc1=(BankATM)obj;
			String opt="";
			do {
				try {
					System.out.println("Welcome, Please Choice one option...");
					System.out.println(" 1. Deposite \n 2.Withdraw \n 3.Balance Enquiry");
					System.out.print("Enter your choice:");
					int n=scn.nextInt();
					switch(n) {
						case 1 :
						{
							System.out.print("Please Enter the deposite amount:");
							double amt=scn.nextDouble();
							acc1.deposite(amt);
							acc1.balanceEnquiry();
							break;
						} 
						case 2 :
						{
							System.out.print("Please Enter withdraw amount:");
							double amt=scn.nextDouble();
							acc1.withdraw(amt);
							acc1.balanceEnquiry();
							break;
						}
						case 3 :
						{
							acc1.balanceEnquiry();
							break;
						}
						default : 
							System.out.println("Please choice valid option");
					}
				}
				catch(InvalidAmountException ie) {
					System.out.println(ie.getMessage());
				}
				catch(InSufficientFundsException ise) {
					System.out.println(ise.getMessage());
				}
				catch(NumberFormatException e) {
					System.out.println("Please enter only number");
				}
				System.out.println("Do you want to continue(Yes/No):");
				opt=scn.next();
			}while(opt.equalsIgnoreCase("Yes"));
			
		}//outer try
		catch(ClassNotFoundException cnfe) {
			System.out.println("Please Enter the class name properly with package name.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
