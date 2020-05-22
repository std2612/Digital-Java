package Day21;

import java.util.*;

public class TestEx3 {
//  - 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 입력한 정수의 합과 평균를 구하세요.(반복문과 배열을 꼭 이용)
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.print("정수 5개를 입력하세요 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+(double)sum/arr.length);
		
		sc.close();
	}

}
