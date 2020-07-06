package Day53;

import java.util.*;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("두 실수와 산술연산자를 입력하세요 ex)1 + 1 : ");
		double num1=sc.nextDouble();
		char op=sc.next().charAt(0);
		double num2=sc.nextDouble();
		System.out.printf("%.1f %c %.1f = %.1f",num1, op, num2, calc(num1, op, num2));
		sc.close();
	}
	static double calc(double num1, char op, double num2) {
		if(op=='+') {
			return num1+num2;
		}else if(op=='-') {
			return num1+num2;
		}else if(op=='*') {
			return num1*num2;
		}else if(op=='/') {
			return num1/num2;
		}else if(op=='%') {
			return num1%num2;
		}else {
			return 0;
		}
	}
}
