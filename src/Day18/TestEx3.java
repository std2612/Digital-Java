package Day18;

import java.util.*;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num=sc.nextInt();
		
		try {
			printIsPrime(num);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		sc.close();
	}
	
	public static void printIsPrime(int num) {
		if(num<0) {
			throw new ArithmeticException("양의 정수를 입력해주세요.");
		}
		
		int cnt=0;
		
		for(int i=1; i*i<num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		
		if(cnt==1) {
			System.out.printf("%d는 소수입니다.%n", num);
		}
		if(cnt>1) {
			System.out.printf("%d는 소수가 아닙니다.%n", num);
		}
		
	}

}
