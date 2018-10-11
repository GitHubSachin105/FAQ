package com.sac.iaq;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr= {1,5,4,2,8,6,9};
		for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tmp = 0;
	            if (arr[i] > arr[j]) {
	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	        }
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
