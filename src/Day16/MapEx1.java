package Day16;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>(); // <>가 필요한 클래스 = 제너릭 클래스
		map.put("abcd", "1234");
		map.put("abcd", "12345");
		map.put("abcde", "1234");
		
		Set<Map.Entry<String, String>> set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry e=(Map.Entry)it.next();
			System.out.println("ID : "+e.getKey());
			System.out.println("PW : "+e.getValue());
		}
		Set keySet=map.keySet();
		Collection valueSet=map.values();
	}

}
class Student {
	String name;
}
