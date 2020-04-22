package Day4;

public class TestEx2 {

	public static void main(String[] args) {
		/* 1.정수 10개를 저장할 수 있는 배열을 선언하고 생성하세요.
		 * 2.1부터 10까지 차례대로 배열에 저장하세요.
		 * 3.저장된 배열의 값을 출력하세요.
		 * 4.인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요.
		 * 5.저장된 배열의 값을 다시 출력하세요.*/
		int arr[]=new int[10]; 					// 1.
		int i=0;
		for(i=0; i<arr.length; i++) {			// 2.
			arr[i]=i+1;
		}
		i=0;
		for(int tmp:arr) {						// 3.
			System.out.printf("%2d ",tmp);		// 자릿수를 맞추기 위해 "%2d "
		}
		System.out.println();
		for(i=0; i<arr.length; i++) {			// 4.
			if(i%2==0) {
				arr[i]*=2;
			}
		}
		i=0;
		for(int tmp:arr) {						// 5.
			System.out.printf("%2d ",tmp);
		}
		System.out.println();
		i=0; 									// 2.
		while(i<arr.length) {
			arr[i]=i+1;
			i++;
		}
		i=0; 									// 3.
		for(int tmp:arr) {
			System.out.printf("%2d ",tmp);
		}
		i=0; 									// 4.
		while(i<arr.length) {
			arr[i]*=2;
			i+=2;
		}
		System.out.println();
		i=0; 									// 5.
		for(int tmp:arr) {
			System.out.printf("%2d ",tmp);
		}
		System.out.println();					// 짝수인덱스만 출력
		for(i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.printf("%2d ",arr[i]);
			}
		}
		System.out.println();
		for(i=0; i<arr.length; i+=2) {			// 짝수인덱스만 2
			System.out.printf("%2d ",arr[i]);
		}
				
	}

}
