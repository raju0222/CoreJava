package com.learn.ds.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue is DS which follows FIFO (First IN FIRST OUT) where in real time scenarios we need to do operations
 * based on priority. 
 * 
 * To achieve that java provides PriorityQueue where we can define the priority of the queue using the Comparator
 * implementation.
 * 
 * As like queue , it supports all the operations.
 * 
 * This is not thread-safe , to achieve thread-safe java provided PriorityBlockingQueue.
 * 
 * */


public class PriorityQueueTest {

	public static void main(String[] args) {
		Comparator<String> length = new Comparator<String>() {
			@Override
		    public int compare(String x, String y)
		    {
		        if (x.length() < y.length()) {
		            return -1;
		        }
		        if (x.length() > y.length()) {
		            return 1;
		        }
		        return 0;
		    }
	    };
		
		
		Queue<String> pQ = new PriorityQueue<>(length);
		pQ.add("hello");
		pQ.add("hi");
		pQ.add("hyderabad");
		pQ.add("abudhabi");
		
		System.out.println("Elements in PQ before :"+pQ);
		
		pQ.poll();
		pQ.remove();
		
		System.out.println("Elements in PQ After :"+pQ);
	}
}
