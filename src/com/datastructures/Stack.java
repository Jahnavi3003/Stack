package com.datastructures;

import java.util.LinkedList;

public class Stack {
	
	LinkedList<Integer> linkedList = new LinkedList<Integer>();

	
	public void push(Integer data) {
		linkedList.addFirst(data);
	}
	
	public void peak() {
		System.out.println("\n" + linkedList.peek());
	}
	
	
	public void pop() {
		while(linkedList.size() != 0) {
			linkedList.pop();
		}
	}

	
	public void printStack() {
		System.out.println(linkedList.toString());
	}

	
	public static void main(String[] args) {
		
		System.out.println(" Welcome To Stack Program");

		Stack stack = new Stack();
		stack.push(70); 
		stack.push(30); 
		stack.push(56);
		stack.printStack();
		stack.peak();                 
		stack.pop();              
		stack.printStack();

}
}