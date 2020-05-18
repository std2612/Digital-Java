package Day18;

import java.util.*;

public class TestEx4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num=sc.nextInt();
		
		try {
			if(isPrime(num)) {
				System.out.printf("%d : 소수입니다.%n", num);
			}else {
				System.out.printf("%d : 합성수입니다.%n", num);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static boolean isPrime(int num) {
		if(num==1) {
			throw new ArithmeticException("예외 : 1은 소수도 아니고 합성수도 아닙니다.");
		}
		if(num<1) {
			throw new ArithmeticException("예외 : 0과 음수는 소수 판별을 할 수 없습니다.");
		}
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
