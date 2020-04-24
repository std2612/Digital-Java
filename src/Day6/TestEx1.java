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
		for(int i=1; i<=5; i++)	{
			for(char ch='a'; ch<='a'+i-1; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		/* 두 정수를 입력하면 다음과 같이 출력되도록 작성하세요.
		 * 3 5
		 *   1  2  3  4  5
		 *   6  7  8  9 10
		 *  11 12 13 14 15 
		 * */
		int i, j;
		System.out.print("두 정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		i=scan.nextInt();
		j=scan.nextInt();
		scan.close();
		int arr[][]=new int[i][j];
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[0].length; j++) {
				arr[i][j]=i*5+j+1;
			}
		}
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[0].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
				if(j==arr[0].length-1) {
					System.out.println();
				}
			}
		}
	}

}
