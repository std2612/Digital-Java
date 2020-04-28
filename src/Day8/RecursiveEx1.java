package Day8;

public class RecursiveEx1 {

	public static void main(String[] args) {
		// 재귀호출을 이용한 팩토리얼
		System.out.println(facto(5));
	}
	//팩토리얼 메서드
	public static int facto(int n) {
		if(n==1||n==0)
			return 1;
		if(n<0)
			return 0;
		return n*facto(n-1);
	}

}
/* 실행 순서 :	5-7-
 * 			(n=5) 10-11-13-15-
 * 			(n=4) 10-11-13-15-
 * 			(n=3) 10-11-13-15-
 * 			(n=2) 10-11-13-15-
 * 			10(n=1)-11-12-
 * 			15(n=2)-
 * 			15(n=3)-			// 호출된 순서의 역순으로 facto(5)까지 거슬러 올라감
 * 			15(n=4)-
 * 			15(n=5)-
 * 			7-8
 * */
