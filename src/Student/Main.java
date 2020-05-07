package Student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] std=new Student[1000];
		Manager mng=new Manager();
		int menu=0;
		while(menu!=5) {
			printMenu();
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				mng.insertStudent();
				break;
			case 2:
				System.out.println("학생정보수정");
				break;
			case 3:
				System.out.println("학생정보삭제");
				break;
			case 4:
				System.out.println("학생정보출력");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");	
			}
		}
	}
	public static void printMenu() {
		System.out.println("------------");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 종료");
		System.out.println("------------");
		System.out.print("메뉴 번호를 입력하세요 : ");
	}
	
}
