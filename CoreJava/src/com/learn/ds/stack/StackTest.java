package com.learn.ds.stack;

import java.util.Stack;

/*
 * Stack is a DS where it stores the values as LIFO pattern.(Last in First Out) 
 * So the value last inserted will go(remove) out first when we use pop() method.
 * push() to add a value to stack.
 * pop() to remove a value from stack ,  if u try to print that then it will show the pop value also.(it will remove and show the value)
 * peek() to get a value from stack  (It will show the value only)
 * 
 * */

public class StackTest {

	public static void main(String[] args) {
		Stack<String> st= new Stack<>();
		st.push("One");
		st.push("Two");
		st.push("Three");
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		st.pop();
		System.out.println(st);
		

	}

}
