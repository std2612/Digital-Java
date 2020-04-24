package Day6;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* 문제 다음과 같이 출력되도록 코드를 작성하세요
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * */
		for(int i=0; i<=4; i++)	{
			for(char ch='a'; ch<='a'+i; ch++) {		// char로 for문
				System.out.print(ch);
			}
			System.out.println();
		}
		char ch='a';
		for(int i=0; i<=4; i++)	{
			for(int j=0; j<=i; j++) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		/* 문자 상수 a + 상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에
		 * 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다
		 * */
		/* 두 정수를 입력하면 다음과 같이 출력되도록 작성하세요.
		 * 3 5
		 *   1  2  3  4  5
		 *   6  7  8  9 10
		 *  11 12 13 14 15 
		 * */
		int x, y;
		System.out.print("두 정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();
		scan.close();
		int arr[][]=new int[x][y];
		for(x=0; x<arr.length; x++) {
			for(y=0; y<arr[0].length; y++) {
				arr[x][y]=arr[0].length*x+y+1;
			}
		}
		for(x=0; x<arr.length; x++) {
			for(y=0; y<arr[0].length; y++) {
				System.out.printf("%2d ", arr[x][y]);
				if(y==arr[0].length-1) {
					System.out.println();
				}
			}
		}
	}
}
