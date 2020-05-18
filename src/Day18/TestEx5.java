package Day18;

import java.util.*;

public class TestEx5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		
		System.out.print("두 정수를 입력하세요 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		try {
			if(isCoPrime(num1, num2)) {
				System.out.printf("%d, %d : 서로소입니다.", num1, num2);
			}else {
				System.out.printf("%d, %d : 서로소가 아닙니다.", num1, num2);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static boolean isCoPrime(int num1, int num2) {
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
			return true;
		}
		return false;
	}
}
