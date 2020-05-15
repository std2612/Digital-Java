package Day17;

import java.util.*;

public class MethodEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.print("두 정수와 연산자를 입력하세요.(Ex. 1 + 2) : ");
		try {
			num1=sc.nextInt();
			op=sc.next().charAt(0);
			num2=sc.nextInt();
					
			System.out.printf("%d %c %d = %.1f",num1, op, num2, cal(num1, op, num2));
		}catch (ArithmeticException e) {
				System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
}
//	기능 : 사칙연산+나머지 메서드 5개
	
//	산술연산자 op를 이용한 위 기능을 합친 메서드
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static double division(int a, int b) {
		return (double)a/b;
	}
	
	public static int remainder(int a, int b) {
		return a%b;
	}
	
	public static double cal(int a, char op, int b) {
		double res=0;
		
		switch(op) {
		case '+':
			res=plus(a, b);
			break;
		case '-':
			res=minus(a, b);
			break;
		case '*':	case 'x':
			res=multiply(a, b);
			break;
		case '/':
			if(b==0) {
				throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다.");
			}
			res=division(a, b);
			break;
		case '%':
			if(b==0) {
				throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다.");
			}
			res=remainder(a, b);
			break;
		default:
			throw new ArithmeticException("예외 발생 : 잘못된 연산자입니다.");
		}
		return res;
		
	}
	
}
