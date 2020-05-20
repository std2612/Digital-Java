package Day03;

import java.util.Scanner;

public class ForEx07 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최대 공약수를 구하는 코드를 작성하세요.
		 * 1.반복 횟수 : i는 1부터 num2까지 1씩 증가
		 * 2.규칙성 : i가 num1과 num2의 약수이면 gcd에 저장
		 * 3.반복문 종료후 : num1과 num2의 최대 공약수는 i라고 출력
		 * */
		int num1 = 0, num2 = 0, gcd = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수 중 작은 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두 정수 중 큰 정수를 입력하세요 : ");
		num2 = scan.nextInt();
		for(int i=1; i<=num1; i+=1) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd=i;
			}
			
		}
		System.out.printf("%d와(과) %d의 최대 공약수는 %d입니다.",num1, num2, gcd);
		scan.close();
	}

}
