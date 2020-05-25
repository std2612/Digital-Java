package Day23;

import java.util.*;

public class OperatorEx1 {

	public static void main(String[] args) {
		
//		정수 num가 짝수이면 true를 홀수이면 false를 출력하는 코드를 조건문없이 작성하세요.
//		Ex) 4
//		4는 짝수입니까? true
//		Ex) 5
//		5는 짝수입니까? false
		
		Scanner sc=new Scanner(System.in);
			
		System.out.print("정수를 입력하세요 : ");
		Integer num=sc.nextInt();
		
		System.out.println(num+"는 짝수입니까? "+(num%2==0));
		
		System.out.println(num+"는 짝수입니까? "+(num%2==0? true:false));
		
		sc.close();
	}

}
