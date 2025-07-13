package com.vibol.Datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,2,9,1,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("=====Selection Sort=====");
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0 ;i<n-1;i++) {
			int minIndex=i;
			// j is the element iteration 
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			//after we find the index min we swap 
			int tmp = arr[minIndex];
			arr[minIndex]= arr[i];
			arr[i]=tmp;
			
			//1:tmp = 2
			//2:arr[1]=5; swap index 1
			//3:arr[0]=2; swap index 0
		}
	}

}
