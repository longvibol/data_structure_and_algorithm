package com.vibol.Datastructure.excercise;

public class DataParser {
	
	public Data parse(String line) {
		String[] parts = line.split(";");
		String id = parts[0];
		long value = Long.parseLong(parts[1]);
		
		return new Data(id, value);
	}

}
