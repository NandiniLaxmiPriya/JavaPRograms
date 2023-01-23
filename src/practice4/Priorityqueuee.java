package practice4;

import java.util.PriorityQueue;

public class Priorityqueuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(10);
		pq.offer(14);
		pq.offer(13);
		pq.offer(1);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
	}

}
