package Day02;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		//switch문을 이용한 홀짝 판별 예제
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num =scan.nextInt();
		scan.close();
		switch(num % 2) {
		case 0:
			System.out.println(num + "은(는) 짝수입니다.");
			break;
		case 1://default:
			System.out.println(num + "은(는) 홀수입니다.");
			break;
		}

	}

}