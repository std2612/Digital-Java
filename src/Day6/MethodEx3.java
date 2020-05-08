package Day6;

public class MethodEx3 {

	public static void main(String[] args) {
		/* 매개변수가 일반 변수이면 매개변수의 원본값이 변경되지 않는다. "파일을 복사한 것"*/
		int num1=10, num2=20;
		System.out.printf("num1=%d, num2=%d(main)%n",num1,num2);
		swap(num1,num2);
		System.out.printf("num1=%d, num2=%d(main)%n",num1,num2);
		
		int arr[]=new int[4];
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		/* 매개변수가 참조 변수이면 매개변수의 원본값을 바꿀 수 있다. "바로가기를 복사한 것"*/
		setArr(arr,5);
		
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		

	}
	
	public static void swap(int num1, int num2) {
		int tmp=num1;
		num1=num2;
		num2=tmp;
		System.out.printf("num1=%d, num2=%d%n",num1,num2);
	}
	public static void setArr(int []arr, int num) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=num;
		}
	}

}
