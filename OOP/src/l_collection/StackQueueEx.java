package l_collection;

import java.util.*;


public class StackQueueEx {

	public static void main(String[] args) {
		// Stack -LIFO(Last in First Out)
		
		Stack stack = new Stack();
		stack.push("A"); // stack 추가
		stack.push("B");
		stack.push("C");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()); //stack 뽑아오기.
		}
		
		//System.out.println(stack.pop());
		
		
		
		//Queue - FIFO(First In First Out)
		//Queue queue = new Queue(); //Queue는 Interface라서 객체 생성 불가.
		Queue queue = new LinkedList();
		queue.offer("가");    //queue 추가.
		queue.offer("나");
		queue.offer("다");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); //queue 뽑아오기.
		}

	}

}
