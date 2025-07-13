package com.vibol.Datastructure.excercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReaderImprove {
	
	private DataParser dataParser = new DataParser();
	private DataCollector dataCollector = new DataCollector(3);
	
	public List<String> readLine(String filePath) {
		
		List<String> list = new ArrayList<>();		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));			
			String line;
			while((line = reader.readLine())!=null) {
				Data data = dataParser.parse(line);
				dataCollector.add(data);
			}			
				
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return dataCollector.getTopIds();
	}

}
