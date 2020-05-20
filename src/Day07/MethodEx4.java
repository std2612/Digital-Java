package Day07;

import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
		int num=0, start=0, end= 0;
		Scanner scan=new Scanner(System.in);
		System.out.print("출력할 구구단의 단을 입력하세요 : ");
		num=scan.nextInt();
		System.out.print("단의 시작을 입력하세요 : ");
		start=scan.nextInt();
		System.out.print("단의 끝을 입력하세요 : ");
		end=scan.nextInt();
		scan.close();
		gugudanArr(num);
		System.out.println("----------------");
		printGugudan(num,start,end);
				
	}
/* 기능 : num가 주어지면 주어진 num단을(구구단)을 출력하는 메서드*/
	public static int[] gugudanArr (int num) {
		int arr[]=new int[9];
		int i=0;
		for(i=0; i<=8; i++) {
			arr[i]=num*(i+1);
		}
		return arr;
	}
	public static int printGugudan (int num, int start, int end) {
		if(num==0) {
			System.out.println("0단의 모든 값은 0입니다.");
			return 0;
		}
		if(start>end) {
			System.out.println("단의 시작이 단의 끝보다 큽니다.");
			return -1;
		}
		for(int i=start; i<=end; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num*i);
		}
		return 1;
	}
}
