package com.sac.pattern;

import java.util.Scanner;

public class Triangle3 { 
	public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
    	System.out.print("Enter the no of rows:");
    	int n=scn.nextInt();
    	//close the Scanner obj
    	scn.close();
        // number of spaces 
        int i, j, k=2*n-2; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=0; j<k; j++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
              
            // decrementing k after each loop 
            k = k - 2; 
              
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
        } 
    }
}


/* -------------output------------------
 
        * 
      * * 
    * * * 
  * * * * 
* * * * *
 
 */ 
