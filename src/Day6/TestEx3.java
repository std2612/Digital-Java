package Day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		/* 학생 5명의 성적을 입력받아 해당 해당의 성적을 학점으로 출력하세요.
		 * 학생의 성적이 음수가 입력되면 종료하도록 코드를 작성하세요.
		 * 90~100	: A
		 * 80~89	: B
		 * 70~79	: C
		 * 60~69	: D
		 * 50~59	: E
		 * 0~49		: F
		 * 나머지 =
		 * */
		Scanner scan=new Scanner(System.in);
		for(int i=1;; i++) {
			System.out.printf("성적을 입력하세요 : ");
			int score=scan.nextInt();
			if(90<=score && score<=100) {
				System.out.println(score+"점은 A학점입니다.");
			}
			else if(80<=score && score<=89) {
				System.out.println(score+"점은 B학점입니다.");
			}
			else if(70<=score && score<=79) {
				System.out.println(score+"점은 C학점입니다.");
			}
			else if(60<=score && score<=69) {
				System.out.println(score+"점은 D학점입니다.");
			}
			else if(50<=score && score<=59) {
				System.out.println(score+"점은 E학점입니다.");
			}
			else if(0<=score && score<=49) {
				System.out.println(score+"점은 F학점입니다.");
			}
			else if(100<score) {
				System.out.println(score+"점은 잘못된 점수입니다.");
			}
			else {
				System.out.printf("지금까지 입력 확인한 학생의 수는 %d명입니다.%n", i);
				System.out.println("종료합니다.");
				break;
			}
		}
		scan.close();
		
	}

}
