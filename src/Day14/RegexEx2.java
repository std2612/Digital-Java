package Day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
		/* 아이디를 입력받고 아이디가 유효한 아이디인지 검사하는 코드를 작성하세요.
		 * 아이디의 조건
		 * 1.알파벳 + 숫자
		 * 2.첫글자 알파벳
		 * 3.5글자 이상 10글자 이하
		 * Ex)
		 * 아이디를 입력하세요 : 1abcd
		 * 1abcd는 유효하지 않은 아이디입니다.
		 * Ex)
		 * 아이디를 입력하세요 : abcde1
		 * abcde1은 유효한 아이디입니다. */
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("아이디의 조건");
		System.out.println("1.알파벳 + 숫자");
		System.out.println("2.첫글자 알파벳");
		System.out.println("3.5글자 이상 10글자 이하");
		System.out.print("아이디를 입력하세요 : ");
		id = sc.next();
		Pattern p = Pattern.compile("([a-zA-z]\\w{4,9})");
		Matcher m = p.matcher(id);
		if(!m.matches()) {
			System.out.println(id+"는 유효한 아이디가 아닙니다.");
			id=null;
			sc.close();
			return;
		}else {
			sc.close();
			System.out.println(id+"는 유효한 아이디입니다.");
		}
		
		
	}

}
