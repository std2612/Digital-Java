package Day53;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char ch='N';
		
		for(;;) {
			System.out.print("문자를  입력하세요 : ");
			ch=sc.next().charAt(0);
			if(ch=='Y' || ch=='y') {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}

}
