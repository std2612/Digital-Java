package Day18;

import java.util.*;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("성적을 입력하세요(0~100) : ");
		int score=sc.nextInt();
		
		try {
			System.out.printf("입력받은 성적의 학점은 %s입니다.%n", grade(score));
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		sc.close();
		
	}
	
	public static String grade(int score) {
		if(score<0 || score>100) {
			throw new ArithmeticException("성적의 범위는 0~100입니다.");
		}
				
		if(score>=90) {
			return "A";
		}
		if(score>=80) {
			return "B";
		}
		if(score>=70) {
			return "C";
		}
		if(score>=60) {
			return "D";
		}
		return "F";
	}
	
}
