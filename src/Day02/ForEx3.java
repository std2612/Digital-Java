package Day02;

public class ForEx3 {

	public static void main(String[] args) {
		// 1부터 10까지의 합을 구하는 코드를 for문으로 작성하세요.
		// 1. 반복 횟수 : i는 1부터 10까지 1씩 증가
		// 2. 규칙성 :
		// sum = 0;
		// i=1, sum = 0 + 1
		// i=2, sum = 0 + 1 + 2
		int i, sum = 0;
		for(i=1; i<=5; i+=1) {
			sum+=i; // sum = sum + i;
			System.out.printf("1부터 %d까지의 합 = %d%n", i, sum);
		}

	}

}
