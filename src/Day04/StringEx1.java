package Day04;

public class StringEx1 {

	public static void main(String[] args) {
		// String의 선언과 생성
		String str="홍길동";
		String str1=new String("임꺽정");
		String arr[]=new String[3];
		arr[0]=str;
		arr[1]=str1;
		arr[2]="이순신";
		for(String s:arr) {
			System.out.println(s);
		}

	}

}
