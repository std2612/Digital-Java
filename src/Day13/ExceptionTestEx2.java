package Day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTestEx2 {

	public static void main(String[] args) {
		/* 정수값을 반복적으로 받는 코드에서 실수로 정수대신 문자를 입력했을 때 예외를 처리하도록 코드를 작성하세요.
		 * Ex)
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 2
		 * 정수를 입력하세요 : 3
		 * 정수를 입력하세요 : a
		 * 예외가 발생했습니다 : 문자를 입력했습니다 - a */
		Scanner sc=new Scanner(System.in);
		try {
			for(;;) {
				System.out.print("정수를 입력하세요 : ");
				int num=sc.nextInt();
			}
		}catch(InputMismatchException e) {
			System.out.println("예외가 발생했습니다 : 정수를 입력해야 하는데 문자를 입력했습니다.");
			e.printStackTrace();
		}catch(Exception e) {
			
		}finally {
			sc.close();
			System.out.println("프로그램을 종료합니다.");
		}
		
	}

}
