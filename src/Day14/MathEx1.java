package Day14;

import static java.lang.Math.*;

public class MathEx1 {

	public static void main(String[] args) {
		double num = 1.51;
		// 1.51을 소수점 첫째자리에서 올림
		System.out.println(ceil(num));
		// 1.51을 소수점 첫째자리에서 버림
		System.out.println(floor(num));
		// 1.51을 소수점 첫째자리에서 반올림
		System.out.println(round(num));
		// 1.51을 소수점 둘째자리에서 올림
		num=num*10;
		System.out.println(ceil(num)/10);
		// 1.51을 소수점 둘째자리에서 반올림
		System.out.println(floor(num)/10);
		// 1.51을 소수점 둘째자리에서 반올림
		System.out.println(round(num)/10.0);
		

	}

}
