package Day16;

import java.util.*;

public class ListEx1 {

	public static void main(String[] args) {
//		1~10사이의 랜덤한 수를 생성하여 리스트에 저장하고, 출력하는 코드를 작성하세요. (중복 불가)
		int min=1, max=10, size=6;
		
		List<Integer> list=new ArrayList<Integer>(size);
		
		while(size>list.size()) {
			Integer r=new Random().nextInt(max-min+1)+min;
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		
		System.out.println(list);
	}
//	public static void createList(Object o, List l, int size) {
//		while(size>l.size()) {
//			Integer r=new Random().nextInt(max-min+1)+min;
//			if(!l.contains(r)) {
//				l.add(r);
//			}
//		}
//	}
}