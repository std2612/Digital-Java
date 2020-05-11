package Day13;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요.(-포함) : ");
		String reg = sc.next();
		int idx = reg.indexOf("-2");
		int idx2 = reg.indexOf("-4");
		if(idx==-1 && idx2==-1) {
			System.out.println("해당 주민번호는 남성입니다.");
		}
		else {
			System.out.println("해당 주민번호는 여성입니다.");
		}
		sc.close();
	}

}
