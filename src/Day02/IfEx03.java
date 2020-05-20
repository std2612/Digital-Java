package Day02;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		/* 정수형 변수 num를 선언하고, num의 값을 초기화하여
		 * num가 2의 배수이면 2의 배수라고 출력하고,
		 * 3의 배수이면 3의 배수라고 출력하고,
		 * 6의 배수의면 6의 배수라고 출력하고,
		 * 2, 3, 6의 배수가 아니면 2, 3, 6의 배수가 아닙니다라고
		 * 출력하는 코드를 작성하세요. */
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		if(num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + "은(는) 2의 배수입니다.");
		}else if(num % 3 == 0 && num % 2 != 0){
			System.out.println(num + "은(는) 3의 배수입니다.");
		}else if(num % 6 == 0){
			System.out.println(num + "은(는) 6의 배수입니다.");
		}else {
			System.out.println(num + "은(는) 2, 3, 6의 배수가 아닙니다.");
		}
		// 순서 변경을 해서 만들기
		if(num % 6 == 0) {
			System.out.println(num + "은(는) 6의 배수입니다.");
		}else if(num % 3 == 0){
			System.out.println(num + "은(는) 3의 배수입니다.");
		}else if(num % 2 == 0){
			System.out.println(num + "은(는) 2의 배수입니다.");
		}else {
			System.out.println(num + "은(는) 2, 3, 6의 배수가 아닙니다.");
		}
		// 중첩 if문으로 표현
		if(num % 2 == 0) {
			//이 실행문 까지 왔다는 것은 num는 기본 2의 배수이다
			//그 중에서 3의 배수이기까지 한 num는 6의 배수이다
			if(num % 3 == 0) {
				System.out.println(num + "은(는) 6의 배수입니다.");
			}else {
				System.out.println(num + "은(는) 2의 배수입니다.");
			}
		}else if(num % 3 == 0){
			System.out.println(num + "은(는) 3의 배수입니다.");
		}else {
			System.out.println(num + "은(는) 2, 3, 6의 배수가 아닙니다.");
		}
		scan.close();
	}

}
