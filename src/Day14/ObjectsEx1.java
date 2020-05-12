package Day14;

import java.util.Objects;

public class ObjectsEx1 {

	public static void main(String[] args) {
		String str1 = null;
		System.out.println("객체 str은 null입니까? "+Objects.isNull(str1));
		System.out.println("객체 str은 null이 아닙니까? "+!Objects.isNull(str1));
		System.out.println("객체 str은 null이 아닙니까? "+Objects.nonNull(str1));
		String str2 = "";
//		System.out.println(str1.equals(str2)); // str1이 null이기 때문에 비교할 수가 없다.
		System.out.println(Objects.equals(str1, str2)); // 내부에 null검사를 하기 때문에 따로 조건식을 넣지 않아도 된다.
	}

}
