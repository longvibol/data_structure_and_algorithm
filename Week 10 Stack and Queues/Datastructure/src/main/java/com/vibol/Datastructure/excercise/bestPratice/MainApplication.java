package com.vibol.Datastructure.excercise.bestPratice;

import java.util.List;

import com.vibol.Datastructure.excercise.DataCollector;
import com.vibol.Datastructure.excercise.DataParser;
import com.vibol.Datastructure.excercise.FileLineReader;

public class MainApplication {

	public static void main(String[] args) {
		
		String filePath = "/Users/home/Desktop/data_structure_and_algorithm/Week 10 Stack and Queues/Datastructure/src/main/java/com/vibol/Datastructure/excercise/data.txt";
		String filePath1 = "/Users/home/Desktop/data_structure_and_algorithm/Week 10 Stack and Queues/Datastructure/src/main/java/com/vibol/Datastructure/excercise/output.txt";
		
		DataParser dataParser = new DataParser();
		DataCollector collector = new DataCollector(3);
		var reader = new FileLineReader();
		
		DataLargestFinder finder = new DataLargestFinder(reader, dataParser, collector);
		List<String> topN = finder.findTopN(filePath1);
		System.out.println(topN);
	}

}
