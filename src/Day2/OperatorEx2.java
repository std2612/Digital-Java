package Day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술 연산자 예제
		System.out.println(1/2); //정수/정수=정수. 소수점이 사라짐
		System.out.println(1.0/2);//실수/실수=정수
		int num1 = 1, num2 = 2;
		System.out.println((double)num1/num2);//명시적 자료형 변환을 이용한 정수/정수->실수/정수
//		System.out.println(3/0);// Error
		System.out.println(3/0.0);//무한대로 표시
	}

}
