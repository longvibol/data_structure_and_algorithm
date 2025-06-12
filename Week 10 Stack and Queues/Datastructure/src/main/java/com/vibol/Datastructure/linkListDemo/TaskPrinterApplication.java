package com.vibol.Datastructure.linkListDemo;

public class TaskPrinterApplication {

	public static void main(String[] args) {
		
		TaskPrinter printer = new TaskPrinter();
		printer.addTask("Students Report", 10);
		printer.addTask("Payment Invoice", 2);
		printer.addTask("New Student Enroll", 25);
		printer.addTask("Monthly Report", 2);
		
		printer.cancelTask("Payment Invoice");
		printer.cancelTask("New Student Enroll");
		
		
		printer.displayTasks();
		System.out.println("==========");
		
		printer.printNextTask();
		printer.printNextTask();
		printer.printNextTask();
		printer.printNextTask();
		printer.printNextTask();
		
		
		// array list 
		// create new array then copy them to new array
		// 
		

	}

}
