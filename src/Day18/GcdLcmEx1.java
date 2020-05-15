package Day18;

import java.util.*;

public class GcdLcmEx1 {

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
	
	public static int gcd(int a, int b) {
		int gcd=1;
		
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		
		for(int i=1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		return gcd;
		
	}
	
	public static int lcm(int a, int b) {
		int lcm=1;
		
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		
		for(int i=1; i<=a*b; i++) {
			if(i%a==0 && i%b==0) {
				lcm=i;
				break;
			}
		}
		
		return lcm;
	}
	
}
