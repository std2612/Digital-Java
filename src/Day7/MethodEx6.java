package Day7;

import java.util.Scanner;

public class MethodEx6 {

	public static void main(String[] args) {
		int min=0, max=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("랜덤수의 최소값을 입력하세요 : ");
		min=scan.nextInt();
		System.out.print("랜덤수의 최대값을 입력하세요 : ");
		max=scan.nextInt();
		scan.close();
		int r=random(min,max);
		System.out.println(r);
	}
	/* 기능 : 임의의 정수를 생성하여 알려주는 메서드
	 * 매개변수 : max, min
	 * 리턴타입 : int
	 * 메서드명 : random */
	public static int random(int min, int max) {
		if(min>max) {
			int tmp=min;
			min=max;
			max=tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
}
