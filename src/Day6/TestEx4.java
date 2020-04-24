package Day6;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 0번지에는 0을 1번지에는 1을 넣도록 작성하세요.
		 * 그리고 배열의 값을 출력하여 제대로 들어갔는지 확인하세요.*/
		int arr[]=new int[5];
		
		arrPrint(arr);
		
		for(int i=0; i<arr.length; i++) {		// 배열의 값을 0번지부터 마지막까지 접근하는 반복문
			arr[i]=i;
		}
		
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		arrPrint(arr);
		
		/* num에 1을 저장 후 num의 값이 arr에 있는지 없는지 확인하여 있으면 있습니다
		 * 없으면 없습니다 라고 출력하는 코드를 작성하세요.*/
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num=scan.nextInt();
		int cnt=0;
		scan.close();
		for(int tmp:arr) {
			if(tmp==num) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println(num+"이(가) 없습니다.");
		}
		if(cnt>0) {
			System.out.printf("%d이(가) %d개 있습니다.%n",num,cnt);
		}
		for(int tmp:arr) {
			if(tmp==num) {
				System.out.println(num+"이(가) 있습니다.");
				break;
			}
			/* arr.length-1은 배열 arr의 마지막 인덱스 앞에서 중복 검사를 하기 때문에 마지막 인덱스이면서 여기까지 왔다는 것은
			 * 마지막 번지까지 중복된 내용이 없다는 것이다.
			 * */
			if(tmp==arr.length-1) {
				System.out.println(num+"이(가) 없습니다.");
			}
		}
		if(isDuplicated(arr,num)) {
			System.out.println(num+"이(가) 있습니다.");
		}
		else {
			System.out.println(num+"이(가) 없습니다.");
		}
	}
	
	/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값을들 출력하는 메서드
	 * 매개변수 : arr[i]
	 * 리턴타입 : 없음
	 * 매서드명 : arrPrint*/
	public static void arrPrint(int arr[]) {
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	public static boolean isDuplicated(int arr[], int num) {
		int cnt=0;
		for(int tmp:arr) {
			if(tmp==num) {
				cnt++;
			}
		}
		if(cnt==0) {
			return false;
		}
		return true;
		
	}

}
