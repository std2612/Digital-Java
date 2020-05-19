package Day18;

import java.util.*;

public class ReverseNumPrintEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num=sc.nextInt();
		
		System.out.print("결과 : ");
		
		ReverseNumPrint(num);
		
		System.out.print("결과2 : ");
		
		ReverseNumPrint2(num);
		
		sc.close();
	}
	public static void ReverseNumPrint(int num) {
		while(num!=0) {
			System.out.print(num%10);
			num=(num-(num%10))/10;
		}
		System.out.println();
	}
	
	public static void ReverseNumPrint2(int num) {
		if(num==0) {
			System.out.println();
			return;
		}
		System.out.print(num%10);
		ReverseNumPrint2((num-(num%10))/10);
	}
}
