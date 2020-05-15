package Day17;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
//		Scanner를 클래스 멤버 메소드로 사용할 수 있지만
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		Integer num2= sc.nextInt();
		
		System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
		System.out.printf("%d + %d = %d%n", num1, num2, sum(num1, num2, 0));
		System.out.printf("%d + %d = %d%n", num1, num2, sum(num1, num2));
		
		sc.close();
	}
	
	public static int sum(int num1, int num2, int res) {
		return num1+num2;
	}
	
	public static int sum(int num1, int num2) {
		int res=num1+num2;
		return res;
	}

}
