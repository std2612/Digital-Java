package Day2;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		// num가 주어지면 주어진 num의 약수를 출력하는 코드를 for문으로 작성하세요.
		int i, num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		scan.close();
		for(i=1; i<=num; i+=1) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
