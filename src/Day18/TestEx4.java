package Day18;

import java.util.*;

public class TestEx4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		
		System.out.print("두 정수를 입력하세요 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		try {
			printIsCoPrime(num1, num2);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		sc.close();
	}
	
	public static void printIsCoPrime(int num1, int num2) {
		if(num1<0 || num2<0) {
			throw new ArithmeticException("두 양의 정수가 필요합니다.");
		}
		
		if(num1>num2) {
			int tmp=num1;
			num1=num2;
			num2=tmp;
		}
		
		int gcd=1;
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		
		if(gcd==1) {
			System.out.printf("%d와 %d는 서로소입니다.", num1, num2);
		}
		if(gcd!=1) {
			System.out.printf("%d와 %d는 서로소가 아닙니다.", num1, num2);
		}
	}
}
