package Day23;

public class OperatorEx2 {

	public static void main(String[] args) {
		Integer num=10;
		
		Integer res=(++num)+(num++)+(++num);

//		res는 35이고 num은 13이 됨
		System.out.println(11+11+13);
		System.out.println(res);
		
		Integer[] arr=new Integer[10];
		Integer num2=5;
		Integer num3=arr[num2++];
//		num3에는 5번지가 저장되고 num2는 6이 됨
	}

}
