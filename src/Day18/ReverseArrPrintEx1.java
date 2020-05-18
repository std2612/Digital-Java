package Day18;

import java.util.*;

public class ReverseArrPrintEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입력받을 정수의 갯수 : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.printf("정수 %d개를 입력하세요 : ", size);
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		
		reversePrint(arr);
				
		sc.close();
	}
	
	public static void reversePrint(int[] arr) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
