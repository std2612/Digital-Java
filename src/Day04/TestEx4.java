package Day04;

public class TestEx4 {

	public static void main(String[] args) {
		/* 배열의 내용을 정렬하는 예제*/
		int arr[]=new int[10];
		int i, ranMax=100, ranMin=1;
		for(i=0; i<arr.length; i++) {
			int random=(int)(Math.random()*(ranMax-ranMin+1))+ranMin; // 랜덤 변수를 가지는 배열 생성
			arr[i]=random;
		}
		i=0;
		for(int tmp:arr) {
			System.out.printf("%3d ", tmp); // 배열 확인용 출력
		}
		System.out.println();
		for(i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {	// 더 큰 값을 뒤로 보내는 2중 반복문
				if(arr[j]>arr[j+1]) {
				int tmp=arr[j];		// 임시 변수를 통한 값 교환
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
				}
			}
		} 
		for(int tmp:arr) {
			System.out.printf("%3d ", tmp); // 배열 확인용 출력
		}
		
	}

}
