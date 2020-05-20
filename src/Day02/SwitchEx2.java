package Day02;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// 달(월)이 주어지면 해당하는 달의 마지막 일을 출력하는 코드를 switch문을 이용하여 작성하세요.
		int month = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 월인지 입력하세요 : ");
		month = scan.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("해당 달의 마지막 일은 31일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("해당 달의 마지막 일은 30일 입니다.");
			break;
		case 2:
			System.out.println("해당 달의 마지막 일은 28일 입니다.");
			break;			
		}
		scan.close();

	}

}
