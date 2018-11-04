package com.learn.ds.queue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
/*
 * The PriorityBlockingQueue is the priority queue with thread safe.
 * so this queue uses when we need to implement as a thread.
 * */
public class PriorityBlockQueueTest {

	public static void main(String[] args) {
		/*Comparator<String> length = new Comparator<String>() {

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
*/		
		BlockingQueue<String> pbq = new PriorityBlockingQueue<String>(15,Comparator.reverseOrder());
		
		pbq.add("hyderabad");
		pbq.add("Rajahmundry");
		pbq.add("Chennai");
		pbq.add("Mumbai");
		
		System.out.println(pbq);
		
	}

}
