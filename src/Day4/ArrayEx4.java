package Day4;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제
		int arr[]=new int[3];
		int max=9;
		int min=1;
		// 임의의 수를 생성하면 배열에 저장 (중복 가능)
		for(int i=0; i<arr.length; i++) {
			int random=(int)(Math.random()*(max-min+1))+min;
			arr[i]=random;
		}
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		// 내가 만든 풀이
		int arr2[]=new int[3];
		int cnt1;
		for(cnt1=0; cnt1<arr2.length; cnt1++) {
			int random=(int)(Math.random()*(max-min+1))+min;
			int i=0;
			for(i=0; i<cnt1; i++) {
				if(random==arr2[i]) {
					break;
				}
			}
			if(i==cnt1) {
					arr2[cnt1]=random;
			}
		}
		for(int tmp:arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// 임의의 수를 생성하여 배열에 저장 (중복 X)
		/* 생성된 랜덤수 random :	1 1 2 9
		 * 배열에 저장된 갯수 cnt :	2
		 * 저장된 배열의 값 arr :	1 2 9*/
		int arr3[]= new int[3];
		
		int cnt2=0;
		while(cnt2<arr3.length) { // 저장된 랜덤수의 갯수가 배열 길이보다 적으면 랜덤수를 더 찾기 위해 실행
			int random=(int)(Math.random()*(max-min+1))+min;
			int i=0; // 0번지(1번변수)부터 중복검사하기 위해
			while(i<cnt2) { // (i+1)번 변수가 저장된 변수의 갯수보다 작을 경우, 즉
				if(random==arr3[i]) { // 생성된 랜덤수가 번지수
					break;
				}
				i++;
			}
			if(i==cnt2) {
				arr3[cnt2]=random;
				cnt2++;
			}
			
		}
		for(int tmp:arr3) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		int arr4[]=new int[3];
		
		for(int i=0; i<arr4.length; i++) {
			int random=(int)(Math.random()*(max-min+1))+min;
			int j=0;
			for(j=0; j<i; j++) {
				if(arr4[j]==random) {
					break;
				}
			}
			if(i==j) {
				arr4[i]=random;
			}
			
		}
		for(int tmp:arr4) {
			System.out.print(tmp+" ");
		}
	}
}
