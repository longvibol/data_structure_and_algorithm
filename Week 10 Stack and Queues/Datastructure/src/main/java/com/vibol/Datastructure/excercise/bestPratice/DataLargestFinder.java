package com.vibol.Datastructure.excercise.bestPratice;

import java.util.List;

import com.vibol.Datastructure.excercise.Data;
import com.vibol.Datastructure.excercise.DataCollector;
import com.vibol.Datastructure.excercise.DataParser;
import com.vibol.Datastructure.excercise.FileLineReader;

public class DataLargestFinder {
	// it is flexible that we use Consumer so the developer can implement by themselef 
	private final FileLineReader reader;
	private final DataParser parser;
	private final DataCollector collector;
	
	public DataLargestFinder(FileLineReader reader, DataParser parser, DataCollector collector) {
		super();
		this.reader = reader;
		this.parser = parser;
		this.collector = collector;
	}
	
	public List<String> findTopN(String filePath){
		reader.readLine(filePath, line->{
			Data data = parser.parse(line);
			collector.add(data);
		});
		
		return collector.getTopIds();
	}

}
