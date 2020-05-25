package Day23;

import java.util.*;

public class ListTest1 {
	
	public static void main(String[] args) {

//		정수 5개를 입력받아 리스트에 저장하고, 저장된 값들의 합의 평균을 구하는 코드를 작성하세요.
//		메소드, 이터레이터 이용
		
		Scanner sc =new Scanner(System.in);
		Integer size=5;
		List<Integer> list = new ArrayList<Integer>(size);
//		list.size() 는 현재 저장된 객체의 갯수를 반환한다. ( 생성자로 용량을 정해줘도 저장된 갯수만 반환 )
		
		System.out.printf("정수 %d개를 입력하세요 : ", size);
		
		for(Integer i=0; i<size; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		
		System.out.println("합 : "+sum(list));
		System.out.println("평균 : "+avg(list));
		
		sc.close();
	}
	
	public static Integer sum(List<Integer> list) {
		Integer sum=0;
		
//		1. Iterator를 생성할 때 Iterator의 <>를 입력을 안하면 Object가 자동으로 들어가고
//			그렇게 되면 it.next()를  통해 가져오는 정보의 클래스도 Object가 되기 때문에 형변환이 필요
//		2. 래퍼 클래스는 null도 저장 가능하므로 래퍼 클래스를 일반 변수에 저장하는 경우 null인지 체크해줘야 한다.
		
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) {
			Integer tmp=it.next();
			if(tmp!=null) {
				sum+=tmp;
			}
		}
		
		return sum;
	}
	
	public static Double avg(List<Integer> list) {
		return (Double)(double)sum(list)/list.size();
	}
	
}
