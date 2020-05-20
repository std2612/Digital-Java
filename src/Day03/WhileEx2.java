package Day03;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요.
		 * 1.반복 횟수 : i는 1부터 num1*num2까지 1씩증가
		 * 2.규칙성 : i가 num1과 num2의 배수이면 lcm에 저장
		 * 3.반복문 종료후 : num1과 num2의 최소 공배수는 lcm이라고 출력 */
		int num1=0, num2=0, i=1, lcm=1, cnt=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수 중 작은 정수를 입력하세요 : ");
		num1=scan.nextInt();
		System.out.print("두 정수 중 큰 정수를 입력하세요 : ");
		num2=scan.nextInt();
		scan.close();
		while(i<=num1*num2) {
			cnt+=1;
			if(i%num1==0&&i%num2==0) {
				lcm=i;
				System.out.printf("%d와(과) %d의 최소 공배수는 %d입니다.%n반복 횟수 : %d회%n",num1, num2, lcm, cnt);
				break;
			}
			i+=1;
		}
		
		/* 위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소 공배수가 큰 경우 반복 횟수가 많아진다.
		 * 그래서 아래처럼 i를 num1부터 시작하여 num1의 배수로 한다면 반복 횟수가 줄어든다.*/
		i=num1;
		cnt=0;
		while(i<=num1*num2) {
			cnt+=1;
			if(i%num2==0) {
				lcm=i;
				System.out.printf("%d와(과) %d의 최소 공배수는 %d입니다.%n반복 횟수 : %d회%n",num1, num2, lcm, cnt);
				break;
			}
			i+=num1;
		}
		if(num1<num2) {
			int tmp;
			tmp=num1;
			num1=num2;
			num2=tmp;			
		}
		i=num1;
		cnt=0;
		while(i<=num1*num2) {
			cnt+=1;
			if(i%num2==0) {
				lcm=i;
				System.out.printf("%d와(과) %d의 최소 공배수는 %d입니다.%n반복 횟수 : %d회%n",num1, num2, lcm, cnt);
				break;
			}
			i+=num1;
		}

	}

}
