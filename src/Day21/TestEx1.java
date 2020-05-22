package Day21;

import java.util.*;

public class TestEx1 {
	// - 두 정수를 입력받아 입력받은 정수 중 큰 수를 출력하는 코드를 작성하세요.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("두 정수를 입력하세요 : ");
		int num1=sc.nextInt(), num2=sc.nextInt();
		
		System.out.println(num1>num2? num1:num2);
		
		sc.close();
	}

}
