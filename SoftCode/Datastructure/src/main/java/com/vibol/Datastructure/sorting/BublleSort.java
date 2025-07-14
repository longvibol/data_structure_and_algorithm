package com.vibol.Datastructure.sorting;

import java.util.Arrays;

public class BublleSort {

	public static void main(String[] args) {
		int[] arr = {5,2,9,1,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("=====Bubble Sort=====");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
}
