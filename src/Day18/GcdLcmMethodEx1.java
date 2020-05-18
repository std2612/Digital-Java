package Day18;

import java.util.*;

public class GcdLcmMethodEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b;
		
		System.out.print("두 정수를 입력하세요 : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.printf("%d 와 %d 의 최대 공약수는 %d 입니다.%n", a, b, gcd(a, b));
		System.out.printf("%d 와 %d 의 최소 공배수는 %d 입니다.%n", a, b, lcm(a, b));
		
		sc.close();
	}
	
//	기능 : 두 정수의 최대 공약수를 알려주는 메서드
//	매개변수 : 두 정수 => int num`, int num2
//	리턴타입 : 최대 공약수 => int
//	메소드명 : gcd
	
	public static int gcd(int num1, int num2) {
		if(num1<0 || num2<0) {
			throw new ArithmeticException("예외 : 최대 공약수는 두 양의 정수가 필요합니다.");
		}
		int gcd=1;
		
		if(num1>num2) {
			int tmp=num1;
			num1=num2;
			num2=tmp;
		}
		
		for(int i=num1; i>=1; i--) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
				break;
			}
		}
		return gcd;
	}
	
	public static int lcm(int num1, int num2) {
		int lcm=1;
		
		if(num1>num2) {
			int tmp=num1;
			num1=num2;
			num2=tmp;
		}
		
		for(int i=1; i<=num1*num2; i++) {
			if(i%num1==0 && i%num2==0) {
				lcm=i;
				break;
			}
		}
		
		return lcm;
	
	}
	
}
