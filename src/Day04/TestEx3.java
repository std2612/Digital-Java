package Day04;

public class TestEx3 {

	public static void main(String[] args) {
		/* 정수 10개짜리 배열에 값을 랜덤으로  생성하여 저장하고(중복O)
		 * 저장된 배열 값 중에서 가장 큰 값과 가장 작은 값을 출력하는 코드를 작성하세요.*/
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
		int max, min;
		max=min=arr[0];
		for(i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];					// 최대값을 1에서 출발하여 더 큰 값이 있을 경우 최대값에 저장
			}								// 최소값을 10에서 시작하여 더 작은 값이 있을 경우 최소값에 저장
			else if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.printf("배열의 값 중 최대값은 %d이고 최소값은 %d이다%n",max, min); // 최대값과 최소값 출력
		
	}

}
