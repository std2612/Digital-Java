package Day54;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
//		컬렉션 프레임워크를 이용하여 1부터 10까지를 저장하는 코드를 작성하세요.
		List<Integer> arr1 = new ArrayList<Integer>();
		Set<Integer> arr2 = new HashSet<Integer>();
		Map<Integer, Integer> arr3 = new HashMap<Integer, Integer>();
		
		for(int i=1; i<=10; i++) {
			arr1.add(i);
			arr2.add(i);
			arr3.put(i, i);
		}
		
		Iterator<Integer> it = arr1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}

}
