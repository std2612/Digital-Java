package Day54;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("두 실수와 산술연산자를 입력하세요\nex)1 + 1 : ");
		double num1=sc.nextDouble();
		char op=sc.next().charAt(0);
		double num2=sc.nextDouble();
		try {
			System.out.printf("%.1f %c %.1f = %.1f",num1, op, num2, calc(num1, op, num2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	
	static double calc(double num1, char op, double num2) throws Exception {
		if(op=='+') {
			return num1+num2;
		}else if(op=='-') {
			return num1+num2;
		}else if(op=='*') {
			return num1*num2;
		}else if(op=='/') {
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1/num2;
		}else if(op=='%') {
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1%num2;
		}else {
			throw new Exception(op+"는 잘못된 연산자입니다.");
		}
	}
}
