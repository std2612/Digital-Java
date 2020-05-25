package Day23;

import java.util.*;

public class SetTest1 {

	public static void main(String[] args) {
//		중복되지 않는 정수 5개를 Set에 저장하고 저장된 값의 합과 평균을 구하세요

		Scanner sc =new Scanner(System.in);
		Integer size=5;
		Set<Integer> set = new HashSet<Integer>(size);
		
		System.out.printf("중복되지 않는 정수 %d개를 입력하세요 : ", size);
		
		for(Integer i=0; i<size; i++) {
			set.add(sc.nextInt());	
		}
		
		while(set.size()!=size) {
			System.out.printf("저장된 정수가 %d개입니다.%n", set.size());
			System.out.printf("중복되지 않는 %d개 더 입력하세요 : ", size-set.size());
			
			for(Integer i=0; i<size-set.size(); i++) {
					set.add(sc.nextInt());
			}
		}
		
		System.out.println(set);
		
		System.out.println("합 : "+sum(set));
		System.out.println("평균 : "+avg(set));
				
		sc.close();
	}
	
	public static Integer sum(Collection<Integer> col) {
		Integer sum=0;
		
		Iterator<Integer> it=col.iterator();
		
		while(it.hasNext()) {
			Integer tmp=it.next();
			if(tmp!=null) {
				sum+=tmp;
			}
		}
		
		return sum;
	}
	
	public static Double avg(Collection<Integer> col) {
		return (Double)(double)sum(col)/col.size();
	}
	
}
