package Day05;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		char op;
		System.out.print("두 정수와 연산자를 입력하세요 (Ex.1 + 2) : ");
		Scanner scan=new Scanner(System.in);
		num1=scan.nextDouble();
		op=scan.next().charAt(0);
		num2=scan.nextDouble();
		scan.close();
		System.out.printf("%.2f %c %.2f = %.4f%n",num1, op, num2, cal(num1, op, num2));
		System.out.printf("%.2f %c %.2f = %.4f%n",num1, op, num2, cal2(num1, op, num2));
	}
	/* 기능 :	두 정수와 연산자가 주어지면 산술연산 결과를 알려주는 메서드
	 * 		단, 예외상황은 없다고 가정한다.
	 * 		잘못된 연산자가 들어오거나, 0으로 나누는 경우 
	 * */
	public static double cal(double num1, char op, double num2) { // If문을 활용한 메서드
		double res=0;
		if(op=='+') {
			res=num1+num2;			
		}
		if(op=='-') {
			res=num1-num2;
		}
		if(op=='*') {
			res=num1*num2;
		}
		if(op=='/') {
			res=num1/num2;
		}
		if(op=='%') {
			res=num1%num2;
		}
		return res;
	}
	public static double cal2(double num1, char op, double num2) { // Switch문을 활용한 메서드
		double res=0.0;
		switch(op){
			case'+':
				res=num1+num2;
				break;
			case'-':
				res=num1-num2;
				break;
			case'*':
				res=num1*num2;
				break;
			case'/':
				res=num1/num2;
				break;
			case'%':
				res=num1%num2;
				break;
		}
		return res;
	}

}
