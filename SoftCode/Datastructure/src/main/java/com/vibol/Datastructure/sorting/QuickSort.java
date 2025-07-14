package com.vibol.Datastructure.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5,2,9,1,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("=====Quick Sort=====");
		quickSort(arr,0,4);
		System.out.println(Arrays.toString(arr));
	}
	
	//First Step We need to find the partition first 
	private static int partitionIndex(int[] arr, int low, int high) {
		//find pivot 
		int pivot = arr[high];
		int i = low -1;
		for(int j = low; j < high; j++) {	
			// arr[low= = 5 and high = 6
			if(arr[j]<pivot) {
				//swap location the lower than pivot to the left 
				i++; // to make index to 0 
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}			
		}
		
		// after finished first step we need to find the pivot continue : [5,2,1] => pivot 1
		// we need to know the index low and high [5,2,1] => low = 0 ; high = 2
		
		int tmp = arr[i+1]; // start from index = 0
		arr[i+1]= arr[high];
		arr[high]= tmp;		
		
		return i+1;
		
	}	
	
	// low = index 0 ; high = last index 
	public static void quickSort(int[] arr,int low, int high) {
		// condition index low need to be smaller than high index 
		if(low < high) {
			int pi = partitionIndex(arr, low, high);
			quickSort(arr,low,pi-1); //left 
			quickSort(arr,pi+1,high); //right 
		}
		
	}

}
