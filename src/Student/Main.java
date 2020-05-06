package Student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String menu;
		Student []arr = new Student[1000];
		int cnt = 0;
		System.out.println("메뉴");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		menu=scan.next();
		switch(menu) {
		case "1":
			Management m=new Management();
			m.insertStudent();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
		
		Student s=new Student();
		s.setScore(new Subject("국어",40,40,10,10),
				new Subject("영어",40,40,10,10),
				new Subject("수학",40,40,10,10));
		s.printScore();
		}
	
	}

