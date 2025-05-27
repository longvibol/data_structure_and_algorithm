package com.vibol.Datastructure.excercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader {
	
	public List<String> readLine(String filePath) {
		
		List<String> list = new ArrayList<>();		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));			
			String line;
			while((line = reader.readLine())!=null) {
				list.add(line);
			}			
			/*
			String line = reader.readLine();			
			while(line !=null){
				list.add(line);
			}			
			*/			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return list;
	}

}
