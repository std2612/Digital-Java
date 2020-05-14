package Day16;

import java.util.*;

public class SetLottoEx1 {

	public static void main(String[] args) {
//		1. 중복되지 않는 랜덤한 수 6개를 배열에 저장하고, 중복되지 않는 랜덤한 수 1개를 변수에 저장 (1~45) 당첨 번호
//		2. 중복되지 않는 랜덤한 수 6개를 배열에 저장 (1~45) : 자동 생성 번호
//		3. 맞은 갯수 체크 + 보너스 번호가 맞는지 체크
//		4. 맞은 갯수와 보너스 번호 맞는지 여부에 따라 등수를 출력
		int size=6;
		int min=1, max=20;
		HashSet<Integer> lotto=new HashSet<Integer>(size);
		HashSet<Integer> auto=null;
		Integer bonus=0;
		try {
			auto = createRanArr(min, max, size);
			createRanArr(min, max, lotto, size);
			
			bonus=min-1;
			while(!(bonus>=min && bonus<=max)) {
				bonus=random(min, max);
				if(contains(lotto, bonus)) {
					bonus=min-1;
				}
			}
			
			printArray(lotto);
			System.out.println("보너스 : "+bonus);
			
			printArray(auto);
			System.out.println();
			
			int rank=rank(lotto, bonus, auto);
			if(rank!=-1) {
				System.out.println(rank+"등 당첨!");
			}else {
				System.out.println("꽝!");
			}
				
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Integer i=new Integer(100);
		Integer i2=new Integer(100);
		System.out.println(i==i2);

	}
//	기능 : min과 max가 주어지면 min보다 크거나 같고 max보다 작거나 같은 랜덤한 수를 반환하는 메서드
//	매개 변수 : int min, max
//	리턴 타입 : int
//	매서드명 : random
	public static Integer random(int min, int max) {
		if(min>max) {
			throw new ArithmeticException("최소값과 최대값 순서가 바뀌었습니다."); // 부모가 Runtime이라 throws 생략가능
		}
		return new Random().nextInt(max-min+1)+min;
	}
//	기능 : 배열에 정수 num의 값이 있는지 없는지 알려주는 메서드
//	매개 변수 : int[] arr, int num
//	리턴 타입 : boolean
//	메서드명 : contains
	
	public static boolean contains(HashSet<Integer> lotto, Integer num) {
		for(Integer tmp:lotto) {
			if(tmp==num) {
				return true;
			}
		}
		return false;
	}
	
//	기능 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 만들어서 배열의 갯수 만큼 저장하는 메서드
//	매개 변수 : int min, max, HashSet<Integer> hs
//	리턴 타입 : void
//	메서드명 : createRanArr
	
	public static void createRanArr(int min, int max, HashSet<Integer> hs, int size) throws Exception {
			if(hs==null) {
			throw new NullPointerException("빈 배열입니다.");
		}
			if(size > max-min+1) {
				throw new Exception("랜덤한 수의 범위보다 배열의 크기가 큽니다.");
			}
			
		for(;hs.size()<size;) {
			hs.add(random(min, max));
		}
	}
	
	public static HashSet<Integer> createRanArr(int min, int max, int size) throws Exception {
		if(size>max-min+1)
			throw new Exception("랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		
		HashSet<Integer> hs=new HashSet<Integer>(size);
		
		for(;hs.size()<size;) {
			hs.add(random(min, max));
		}
		
		return hs;
	}
	
	public static void printArray(HashSet<Integer> lotto) {
		for(Integer tmp : lotto) {
			System.out.printf("%2d ",tmp);
		}
	}
	
	public static int rank(HashSet<Integer> lotto, Integer bonus, HashSet<Integer> auto) {
		int sameCnt=0;
		for(Integer tmp:lotto) {
			if(contains(auto,tmp)) {
				sameCnt++;
			}
		}
		
		switch(sameCnt) {
		case 6:
			return 1;
		case 5:
			if(contains(auto, bonus)) {
				return 2;
			}
			return 3;
		case 4:
			return 4;
		case 3:
			return 5;
			
		}
		return -1;
	}
}
