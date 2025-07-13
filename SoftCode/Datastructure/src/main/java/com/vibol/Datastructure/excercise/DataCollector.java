package com.vibol.Datastructure.excercise;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DataCollector {
	
	private int numberOfElement;
	private PriorityQueue<Data> heap;
	
	// use for get the data then sort : n is what we limit (3 max) 
	public DataCollector(int n) {
		this.numberOfElement =n;
		// what we want to compare : Data.value
		heap = new PriorityQueue<>(Comparator.comparingLong(Data::getValue));
	}
	
	// add (we take only 3 if it is more then 3 we pop it out 
	
	public void add(Data data) {
		heap.offer(data);
		if(heap.size() > numberOfElement) {
			heap.poll();
		}
	}
	
	// what we want to return from our function 	
	public List<String> getTopIds(){
		return heap.stream()
			.map(Data::getId)
			.toList();
	}

}
