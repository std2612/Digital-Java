package Day21;

import java.util.*;

public class TestEx2 {
	// - 세 정수를 입력받아 입력받은 정수의 합과 평균을 구하세요. 평균은 소수점 2째자리까지 출력
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("세 정수를 입력하세요 : ");
		int num1=sc.nextInt(), num2=sc.nextInt(), num3=sc.nextInt();
		
		System.out.print("합 : ");
		System.out.println(num1+num2+num3);
		
		System.out.print("평균 : ");
		System.out.printf("%.2f", ((double)num1+num2+num3)/3);

		sc.close();
	}

}
