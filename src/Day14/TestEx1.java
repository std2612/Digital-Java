package Day14;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while(true) {
			System.out.print("제목을 입력하세요 : ");
			String title=sc.nextLine();
			if(title.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("단어을 입력하세요 : ");
			String word=sc.next();
			
			// indexOf
			int idx = title.indexOf(word);
			if(idx==-1) {
				System.out.println(title+"에는 "+word+"라는 단어가 없습니다.");
				
			}
			else {
				System.out.println(title+"에는 "+word+"라는 단어가 있습니다.");
			}
			
			// contains
			boolean contain = title.contains(word);
			if(!contain) {
				System.out.println(title+"에는 "+word+"라는 단어가 없습니다.");
			}
			else {
				System.out.println(title+"에는 "+word+"라는 단어가 있습니다.");
			}
			sc.nextLine();
		}
		sc.close();
		
	}

}
