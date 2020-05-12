package Day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		String regNum = sc.nextLine();
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
		Matcher m = p.matcher(regNum);
		if(!m.matches()) {
			System.out.println("올바른 주민번호 형태가 아닙니다.");
			sc.close();
			return;
		}
		
		if(!isValid(regNum.substring(0,6))) {
			System.out.println("유효하지 않은 생년월일입니다.");
			sc.close();
			return;
		}
		
		char gender;
		if(regNum.contains("-")) {
			gender = regNum.charAt(7);
		}else {
			gender = regNum.charAt(6);
		}
		switch(gender) {
		case '1':	case '3':	case '9':
			System.out.println("해당 주민번호는 남성입니다.");
			break;
		case '2':	case '4':	case '0':
			System.out.println("해당 주민번호는 여성입니다.");
			break;
		case '5':	case '7':
			System.out.println("해당 주민번호는 외국인 남성입니다.");
			break;
		case '6':	case '8':
			System.out.println("해당 주민번호는 외국인 여성입니다.");
			break;
		}
		sc.close();
		
	}
	public static boolean isValid(String birth) {
		if(birth == null || birth.length() != 6) {
			return false;
		}
		String sYear =	birth.substring(0,2);
		String sMonth =	birth.substring(2,4);
		String sDay =	birth.substring(4,6);
		int year;
		int month;
		int day;
		try {
			year = Integer.parseInt(sYear);
			month = Integer.parseInt(sMonth);
			day = Integer.parseInt(sDay);
		}catch(Exception e) {
			return false;
		}
		
		
		int lastDay;
		switch(month) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10:	case 12:
			lastDay = 31;
			break;
		case 4:	case 6:	case 9:	case 11:
			lastDay = 30;
			break;
		case 2:
			lastDay = 28;
			break;
		default:
			return false;
		}
		if(day < 1 || day > lastDay) return false;
		return true;
		
	}
}
