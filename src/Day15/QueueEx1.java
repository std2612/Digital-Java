package Day15;

import java.util.*;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q.poll()+"을 스택에서 꺼냈습니다.");
		System.out.println(q.poll()+"을 스택에서 꺼냈습니다.");
		System.out.println(q.poll()+"을 스택에서 꺼냈습니다.");
		// 큐는 LinkedList로 만들었고, 이 때 offer는 마지막 객체 뒤에 새로운 객체 정보를 저장한다.
		// poll은 0번지의 값을 제거하고 반환한다.
		for(Integer tmp:q) {
			System.out.println(tmp);
		}
		
		
	}

}
