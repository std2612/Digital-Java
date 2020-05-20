package Day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		// 예제1
		int num1=0, num2=0;
		char op='A';
		//String str;
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수와 한 문자를 입력하세요 (Ex.1 a 2) : ");
		num1=scan.nextInt();
		op=scan.next().charAt(0);
		//str=scan.nextLine();
		num2=scan.nextInt();
		scan.close();
		//System.out.println(""+num1+" "+op+" "+num2);
		System.out.printf("%d %c %d%n",num1, op, num2);
		//System.out.print(""+num1+" "+op+" "+num2+"\n");
		//System.out.println(""+num1+" "+str+" "+num2); // 첫""는 아스키코드값으로 연산되는 것을 막기 위함
		//System.out.printf("%d %s %d%n",num1, str, num2);
		//System.out.print(""+num1+" "+str+" "+num2+"\n");
		/* 문자로 사칙연산을 입력받으면 두 수를 입력받은 사칙연산으로 계산하는 코드를 작성하세요.*/
		if(op=='+') { // if문을 이용해서 풀기
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1+num2);
		}
		else if(op=='-') {
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1-num2);
		}
		else if(op=='/') {
			if(num1%num2==0) {
				System.out.printf("%d %c %d = %d%n",num1, op, num2, num1/num2);
			}
			else if(num1%num2!=0) {
				System.out.printf("%d %c %d = %.2f ",num1, op, num2, (double)num1/num2);
				// 실수가 나올 수 있으므로 앞이나 뒤의 변수을 명시적 형변환을 하여 나머지 변수는 자동 형변환이 되도록 한다.
				System.out.printf("몫 : %d, 나머지 : %d%n",num1/num2, num1%num2);
			}
		}
		else if(op=='*') {
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1*num2);
		}
		else if(op=='%') {
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1%num2);
		}
		else {
			System.out.println(op+"은(는) 연산자가 아닙니다.");
		}
		switch(op) { //switch문을 이용해서 풀기
		case'+':
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1+num2);
			break;
		case'-':
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1-num2);
			break;
		case'/':
			if(num1%num2==0) {
				System.out.printf("%d %c %d = %d%n",num1, op, num2, num1/num2);
			}
			else if(num1%num2!=0) {
				System.out.printf("%d %c %d = %.2f ",num1, op, num2, (double)num1/num2);
				System.out.printf("몫 : %d, 나머지 : %d%n",num1/num2, num1%num2);
			}
			break;
		case'*':
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1*num2);
			break;
		case'%':
			System.out.printf("%d %c %d = %d%n",num1, op, num2, num1%num2);
			break;
		default:
			System.out.println(op+"은(는) 연산자가 아닙니다.");	
			
		}
		
	}

}
