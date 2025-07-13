package com.vibol.Datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,2,9,1,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("=====Insertion Sort=====");
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1 ;i<n; i++) {
			//we need to find the key = value of the array
			int key = arr[i];
			// find compare index 
			//because we start the index compare from 1 so we need to find compare 
			//index from 0 (i-1) = index 0
			
			int j=i-1;
			// we do looping every element 
			
			while(j>=0 && key < arr[j]) {
				// j >=0 mean we start from 0 can not below 0,
				// it j below 0 we stop the loop (array index start from 0)
				
				arr[j+1]= arr[j]; // shift to the right 
				// mean key value that start from 1 < arr[0]
				// we shift the bigger to the right 
				
				j--; // to stop the loop while 
			}
			
			// we assign the new key 
			arr[j+1] =key;
			// we take key value to compare with other
			
			
		}
	}

}
