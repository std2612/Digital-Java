package Day19;

import java.util.*;

public class ReverseNumPrintEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num=sc.nextInt();
		
		System.out.print("메소드1 정수 하나씩 거꾸로 출력 : ");
		
		reverseNumPrint(num);
		
		System.out.print("메소드2 재귀 메소드로 정수 하니씩 거꾸로 출력 : ");
		
		reverseNumPrint2(num);
		
		System.out.print("메소드3 문자열 반환 : ");
		
		System.out.println(reverseNumPrint3(num));
		
		System.out.print("메소드4 제곱을 활용한 정수 반환 : ");
		
		System.out.println(reverseNumPrint4(num));
		
		System.out.print("메소드5 parseInt를 활용한 Integer 반환 : ");
		
		System.out.println(reverseNumPrint5(num));
		
		System.out.print("4와의 합 : ");
		
		System.out.println(num+reverseNumPrint4(num));
		
		System.out.print("5와의 합 : ");
		
		System.out.println(num+reverseNumPrint5(num));
		
		sc.close();
	}
	public static void reverseNumPrint(int num) {
		while(num!=0) {
			System.out.print(num%10);
			num=num/10;
		}
		System.out.println();
	}
	
	public static void reverseNumPrint2(int num) {
		if(num==0) {
			System.out.println();
			return;
		}
		System.out.print(num%10);
		reverseNumPrint2(num/10);
	}
	
	public static String reverseNumPrint3(int num) {
		String res=""+num;
		String reverseRes="";
		for(int i=res.length()-1; i>=0; i--) {
			reverseRes+=res.charAt(i);
		}
		return reverseRes;
	}
	
	public static int reverseNumPrint4(int num) {
		String res=""+num;
		int revNum=0;
		
		for(int i=res.length()-1; i>=0; i--) {
			revNum+=(num%10)*Math.pow(10, i);
			num=num/10;
		}
		
		return revNum;
	}
	
	public static Integer reverseNumPrint5(int num) {
		return Integer.parseInt(reverseNumPrint3(num));
	}
}
