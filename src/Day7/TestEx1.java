package Day7;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		int min=0, max=0, size=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("랜덤수의 최소값을 입력하세요 : ");
		min=scan.nextInt();
		System.out.print("랜덤수의 최대값을 입력하세요 : ");
		max=scan.nextInt();
		System.out.print("배열의 크기를 입력하세요 : ");
		size=scan.nextInt();
		scan.close();
		int arr[]=new int[size];
		createArr(min,max,size,arr);
		arrPrint(arr);
		// 반복 시작(3S)
		// 사용자가 세수를 입력
		
		// 스트라이크 판별
		
		// 볼을 판별
		
		// 3아웃 판별
		// 반복 끝
	}
	/* 기능 : min에서 max사이의 중복되지 않는 n객의 랜덤값을 생성하여 배열에 저장하는 메서드
	 * 매개변수 : min, max, n, int arr[]
	 * 리턴타입 : 	예외처리를 위해 1이면 배열 생성
	 * 			0이면 배열생성 실패 =>boolean
	 * 메서드명: createArr
	 * min=1,max=3,n=4인 경우 주어진 범위보다 많은 랜덤수를 만들어야 해서 무한루프에 빠짐
	 * max-min+1>=n이면 배열 생성 가능, 아니면 배열 생성 실패 */
	public static boolean createArr(int min, int max, int n, int arr[]) {
		if(arr==null)
			return false;
		if(max-min+1<n)
			return false;
		int cnt=0;
		while(cnt<n) {
			int r=random(min,max);
			if(!isDuplicated(arr,r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		return true;
	}
	public static int random(int min, int max) {
		if(min>max) {
			int tmp=min;
			min=max;
			max=tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static void arrPrint(int arr[]) {
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	public static boolean isDuplicated(int arr[], int num) {
		for(int tmp:arr) {
			if(tmp==num) {
				return true;
			}
		}
		return false;
	}
}
