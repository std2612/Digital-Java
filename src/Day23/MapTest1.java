package Day23;

import java.util.*;

public class MapTest1 {
	
	public static void main(String[] args) {

//		카페 등급을 프론트에서 요청을 하면 서버에서 해당 카페 등급에 맞는 카페 리스트와 카페 등급을 프론트로 보내려 한다.
//		카페 등급 : 정수
//		카페 이름 : String
//		카페 리스트 : List<String>
		
		Map<String, Object> map= new HashMap<String, Object>();
		
//		카페 등급이 1등급
		map.put("grade", new Integer(1));
		
		List<String> list = new ArrayList<String>();
		
		list.add("네이버 카페1");
		list.add("네이버 카페2");
		
		map.put("cafeList", list);
		
	}
}
