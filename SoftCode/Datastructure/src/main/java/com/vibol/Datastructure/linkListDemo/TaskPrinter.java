package com.vibol.Datastructure.linkListDemo;

public class TaskPrinter {
	
	// create to store the first task 
	private TaskNode head;	
	// Add task at End
	
	public void addTask(String name, int pages) {
		Task task = new Task(name, pages);
		TaskNode newNode = new TaskNode(task);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		TaskNode current = head;
		while( current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		
	}
	
	// Display all task
	
	public void displayTasks() {
		if(head == null) {
			System.out.println("No pending task");
			return;
		}
		
		TaskNode current = head;
		System.out.println("==== Pending Tasks ==== ");
		while( current != null) {
			System.out.println("- " + current.task.name + " (" + current.task.pages + " pages)");
			current = current.next;
		}
	}
	
	public void printNextTask() {
		if(head == null) {
			System.out.println("No task in the queue.");
			return;
		}
		
		System.out.println("Printing task: " + head.task.name + " (" + head.task.pages + " pages)");
		
		// after print we shif to next (remove from print 
		head = head.next;
	}
	
	// Cancel a task by name
	public void cancelTask(String taskName) {
		if(head == null) {
			System.out.println("No task to cancel.");
			return;
		}
		
		if(head.task.name.equals(taskName)) {
			System.out.println("Canceled task: " + head.task.name);
			// skip mean we over this current take to next task 
			head = head.next;
			return;
		}
		
		TaskNode current = head;
		while(current.next != null && !current.next.task.name.equals(taskName)) {
			current = current.next;
		}
		
		if(current.next == null) {
			System.out.println("Task not found.");
			return;
		}
		
		System.out.println("Canceled task: " + current.next.task.name);
		// we over our current to the next head 
		current.next = current.next.next;
		
		
	}

}
