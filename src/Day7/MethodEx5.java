package Day7;

import java.util.Scanner;

public class MethodEx5 {

	public static void main(String[] args) {
		int num=0;
		System.out.print("소수인지 확인할 정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		scan.close();
		if(isPrime(num)) {
			System.out.printf("%d은(는) 소수입니다.", num);
		}
		else {
			System.out.printf("%d은(는) 소수가 아닙니다.", num);
		}

	}
	/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메서드
	 * 매개변수 : num
	 * 리턴타입 : boolean
	 * 메서드명 : isPrime */
	public static  boolean isPrime(int num) {
		if(num==1)
			return false;
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
