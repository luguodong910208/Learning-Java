package chapter8.chapter8_5;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue����Ԫ�ش�С���������
		PriorityQueue pq = new PriorityQueue();
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		System.out.println(pq);
		System.out.println(pq.poll());
	}

}
