package com.learn.ds.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue is a DS where it follow FIFO (First in First Out).
 * Add to insert value
 * 
 * 
 * Throws exception       Offer value 
 * add(element)             offer(element)
 * remove()          		poll()
 * element()         		peek()
 * 
 * Queue Implementation : 
 * 		Queue is an interface so we cannot use it directly. We need to use its implemented classes to achieve the 
 * functionality of Queue like the Linked list and PriorityQueue bcoz there are not synchronized.
 * To use thread safe we need to implement BlockingQueues which are available under java.util.concurrent package.
 * 
 * Those are PriorityBlockingQueue ArrayBlockingQueue etc.,
 * 
 *  * 	
 * */

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue  = new LinkedList<>();
		
		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		
		System.out.println("Queue before remove : "+queue);
		
		queue.remove();
		queue.poll();
		
		System.out.println("After Remove : "+queue);
		

	}

}
