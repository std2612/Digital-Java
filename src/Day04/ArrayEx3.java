package Day04;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 향상된 for문 예제
		
		int []arr=new int[] {1,3,5,7,2,4,6,8}; // 자동으로 갯수 지정됨 []안에 숫자 필요 없음
		/* 향상된 for문을 주로 사용하는 경우
		 * 1. 배열의 모든 값을 탐색하는 경우
		 * 2. 배열의 값을 수정하지 않는 경우*/
		
		int i=0;
		for(int tmp : arr) { // for문 안에서 변수 선언해야함, 배열과 자료형 맞춰야함
			System.out.print(tmp+" ");
			
		}

	}

}
