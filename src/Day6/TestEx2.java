package Day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 입력받아 출력하는 과정을 5번 반복하세요. 단 소문자 q를 입력하면
		 * 문자 출력대신 종료합니다가 출력되도록 수정하세요.
		 * */
		char ch;
				
		Scanner scan=new Scanner(System.in);
		for(;;) {									// For문+If문
			System.out.printf("문자를 입력하세요 : ");
			ch=scan.next().charAt(0);
			if(ch=='q') {
				System.out.printf("종료합니다.%n");
				break;
			}
			
			System.out.printf("입력 받은 문자 : %c%n", ch);
		}
		
		Loop:
		for(;;) {								// For문+If문
			System.out.printf("문자를 입력하세요 : ");
			ch=scan.next().charAt(0);
			switch(ch) {
			case'q':
				System.out.printf("종료합니다.%n");
				break Loop;
			}
			
			System.out.printf("입력 받은 문자 : %c%n", ch);
		}
		
		while(true) {
			System.out.printf("문자를 입력하세요 : ");				// While문+If문
			ch=scan.next().charAt(0);
			if(ch=='q') {
				System.out.printf("종료합니다.%n");
				break;
			}
			
			System.out.printf("입력 받은 문자 : %c%n", ch);
		}
		
		do {												//DoWhile문+If문
			System.out.printf("문자를 입력하세요 : ");
			ch=scan.next().charAt(0);
			if(ch=='q') {
				System.out.printf("종료합니다.%n");
				break;
			}
			
			System.out.printf("입력 받은 문자 : %c%n", ch);
		}while(true);
				
		scan.close();

	}

}
