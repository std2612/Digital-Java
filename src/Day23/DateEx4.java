package Day23;

import java.text.*;
import java.util.*;

public class DateEx4 {

//	문자열을 Date로 변환하는 코드
	
	public static void main(String[] args) {
		String strDate="2020-05-25 15:24:10";
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date date=format.parse(strDate);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
