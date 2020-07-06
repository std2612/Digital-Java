package Day53;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='N';
		while(true) {
			System.out.print("문자를 입력하세요 : ");
			ch=sc.next().charAt(0);
			if(ch=='Y' || ch=='y') {
				break;
			}
		}
		sc.close();
	}

}
