package Day21;

import java.util.*;

public class TestEx4 {
	//  - 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 
	//  입력한 정수중에 가장 큰 수를 출력하는 코드를 작성하세요.
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.print("정수 5개를 입력하세요 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int greatest=0;
		
		for(int i=0; i<arr.length; i++) {
			if(greatest<arr[i]) {
				greatest=arr[i];
			}
		}
		
		System.out.println("가장 큰 수 : "+greatest);
		
		sc.close();
		
	}

}
