package com.vibol.Datastructure.excercise;

import java.util.List;

public class ReadLineApplication {

	public static void main(String[] args) {

//		LineReader lineReader = new LineReader();
		LineReaderImprove improve = new LineReaderImprove();
		String filePath = "/Users/home/Desktop/data_structure_and_algorithm/Week 10 Stack and Queues/Datastructure/src/main/java/com/vibol/Datastructure/excercise/data.txt";
		
		List<String> lines = improve.readLine(filePath);
		System.out.println(lines);
		
	}

}
