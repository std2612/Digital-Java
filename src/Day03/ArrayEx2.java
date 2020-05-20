package Day03;

public class ArrayEx2 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int tmp;
		num1=num2;
		System.out.println(num1);
		int arr1[]=new int[] {1,2,3,4};
		int arr2[]=new int[] {5,6,7,8};
		int tmparr[]=new int[4];
		/* 아래 코드가 실행되면 arr2가 만든 배열을 arr1과 arr2가 공유하게 됨
		 * arr1에 있던 배열이 사라짐*/
		//arr1=arr2;
		for(int i=0; i<arr1.length; i++) {
			//arr1[i]=arr2[i];
			tmp=arr2[i];
			arr2[i]=arr1[i];	//임시 변수를 통한 배열의 교환 
			arr1[i]=tmp;
		}
		System.out.printf("arr1 = %d %d %d %d%n", arr1[0], arr1[1], arr1[2], arr1[3]);
		System.out.printf("arr2 = %d %d %d %d%n", arr2[0], arr2[1], arr2[2], arr2[3]);
		
		for(int i=0; i<arr1.length; i+=1) {
			tmparr[i]=arr2[i];
			arr2[i]=arr1[i];	//임시 배열을 통한 배열의 교환
			arr1[i]=tmparr[i];
		}
		System.out.printf("arr1 = %d %d %d %d%n", arr1[0], arr1[1], arr1[2], arr1[3]);
		System.out.printf("arr2 = %d %d %d %d%n", arr2[0], arr2[1], arr2[2], arr2[3]);
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);	// arr1의 배열을 0번지부터 arr2에 0번지부터 
		for(int i=0; i<arr1.length; i+=1) {					// arr1.length개 붙여넣겠다
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i+=1) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}
