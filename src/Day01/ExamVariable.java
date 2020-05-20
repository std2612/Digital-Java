package Day1;

import java.util.Scanner;

public class ExamVariable {
	/*main은 콘솔 응용 프로그램이 실행되기 위해 꼭 필요한 것
	(메소드 기능)*/
	public static void main(String[] args) {
		/*콘솔에 원하는 문자열을 출력한 후에 엔터를 치는 것
		(메소드)*/
		System.out.println("Hello world!");
		System.out.println(7+7);
		System.out.println(""+(7+7));
		System.out.println(); // 문자열 불필요 엔터를 침
		//System.out.print(); //에러
		System.out.print("안녕\n"); // 문자열 필요 엔터를 안침
		int num1=10,num2=20;
		System.out.println(num1+","+num2);
		num1=9;
		num2=11;
		System.out.println(num1+","+num2);
		System.out.printf("%2d,%2d\n",num1,num2);
		double dnum=1.23;
		System.out.println(dnum);
		System.out.printf("%7.4f\n",dnum);

		Scanner scan = new Scanner(System.in); //스캐너 켜기
		int num = scan.nextInt(); //입력받은 값을 num에 저장
		System.out.println(num); //num을 출력
		char ch = scan.next().charAt(0); //0첫번째 1두번째 글자를 가져옴
		System.out.println(ch);
		String str = new String(); //문자열을 관리하는 String 클래스
		str = scan.next();
		System.out.println(str);
		scan.close();
	}

}