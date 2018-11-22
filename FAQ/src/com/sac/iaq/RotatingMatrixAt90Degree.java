package com.sac.iaq;

import java.util.Scanner;

public class RotatingMatrixAt90Degree {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.print("Enter flag value 0/1:");
		int flag=scn.nextInt();
		scn.close();
		if(flag==1)
			rotateLeft(matrix,flag);
		else
			rotateRight(matrix,flag);

	}
	//function for rotating the matrix anti-clockwise
	public static void rotateLeft(int[][] matrix,int flag){
		int length=matrix.length;
		for(int i=0;i<length;i++) {
			for(int j=i;j<length-i-1;j++) {
				// store current cell in temp variable 
                int temp = matrix[i][j]; 
       
                // move values from right to top 
                matrix[i][j] = matrix[j][length-1-i]; 
       
                // move values from bottom to right 
                matrix[j][length-1-i] = matrix[length-1-i][length-1-j]; 
       
                // move values from left to bottom 
                matrix[length-1-i][length-1-j] = matrix[length-1-j][i]; 
       
                // assign temp to left 
                matrix[length-1-j][i] = temp; 
			}
		}
	displayMatrix(matrix, flag);
	}
	//function for rotating the matrix anti-clockwise
	public static void rotateRight(int[][] matrix,int flag) {
    	int length = matrix.length-1;
    	   
    	  for (int i = 0; i <= (length)/2; i++) {
    	      for (int j = i; j < length-i; j++) {
    	        
    	       //Coordinate 1
    	       int p1 = matrix[i][j];
    	        
    	       //Coordinate 2
    	       int p2 = matrix[j][length-i];
    	        
    	       //Coordinate 3
    	       int p3 = matrix[length-i][length-j];
    	        
    	       //Coordinate 4
    	       int p4 = matrix[length-j][i];
    	        
    	       //Swap values of 4 coordinates.
    	       matrix[j][length-i] = p1;
    	       matrix[length-i][length-j] = p2;
    	       matrix[length-j][i] = p3;
    	       matrix[i][j] = p4;
    	      }
    	  }
    	  displayMatrix(matrix, flag);
    }
	
	// Function to print the matrix 
    static void displayMatrix(int matrix[][],int flag){ 
        for (int i = 0; i < matrix.length; i++) 
        { 
            for (int j = 0; j < matrix.length; j++) 
                System.out.print(" " + matrix[i][j]); 
       
            System.out.print("\n"); 
        } 
        System.out.print("\n"); 
    } 	
    
    
}
