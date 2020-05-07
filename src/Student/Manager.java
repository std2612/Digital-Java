package Student;

import java.util.Scanner;


public class Manager {
	Scanner sc=new Scanner(System.in);
	
	public void insertStudent() {
		Student std=new Student();
		
		System.out.println("학생 정보 추가");
		System.out.print("이름을 입력하세요 : ");
		String name=sc.next();
		System.out.print("학년을 입력하세요 : ");
		int grade=sc.nextInt();
		System.out.print("반을 입력하세요 : ");
		int classNum=sc.nextInt();
		System.out.print("번호을 입력하세요 : ");
		int num=sc.nextInt();
		
		std.setName(name);
		std.setGrade(grade);
		std.setClassNum(classNum);
		std.setNum(num);
		
		System.out.print("과목 정보를 입력하시겠습니까?(y/n) : ");
		char haveSub=sc.next().charAt(0);
		if(haveSub=='y') {
			System.out.print("과목수를 입력하세요 : ");
			int titleNum=sc.nextInt();
			Subject[] sub=new Subject[titleNum];
			for(int i=0; i<titleNum; i++) {
				System.out.print("과목명을 입력하세요 : ");
				String tit=sc.next();
				System.out.print("중간고사 점수를 입력하세요 : ");
				int mid=sc.nextInt();
				System.out.print("기말고사 점수를 입력하세요 : ");
				int fin=sc.nextInt();
				System.out.print("수행평가 점수를 입력하세요 : ");
				int per=sc.nextInt();
				System.out.print("출석 점수를 입력하세요 : ");
				int att=sc.nextInt();
				std.setScore(new Subject(tit,mid,fin,per,att));
						}
			std.printStudent();
			std.printScore();
		}
		if(haveSub=='n') {
			System.out.println("과목이 없습니다.");
			std.printStudent();
		}
		
		if(haveSub!='y' && haveSub!='n') {
			System.out.println("잘못된 입력입니다.");
			std.printStudent();
		}
		System.out.println("학생 수 : "+Student.count);
		
		
		
	}

	
	public void modifyStudent() {
		
	}

	
	public void deleteStudent() {
		
	}

	
	public void printStudent() {
		
	}

}
