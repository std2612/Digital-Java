package Day13;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제목을 입력하세요 : ");
		String title=sc.nextLine();
		System.out.print("단어을 입력하세요 : ");
		String word=sc.next();
		int idx =title.indexOf(word);
		if(idx==-1) {
		System.out.println(title+"에는 "+word+"라는 단어가 없습니다.");
			
		}
		else {
			System.out.println(title+"에는 "+word+"라는 단어가 있습니다.");
			
		}
		sc.close();
		
		
	}

}
