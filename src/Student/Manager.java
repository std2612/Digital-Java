package Student;

import java.util.Scanner;

public class Manager {
	static int count=0;	
	Scanner sc=new Scanner(System.in);
	public int insertStudent(Student[] arr, Student std) {
				
		System.out.print("이름을 입력하세요 :");
		String name=sc.next();
		std.setName(name);
		
		System.out.print("학생의 학년을 입력하세요 : ");
		int grade=sc.nextInt();
		std.setGrade(grade);
		
		System.out.print("학생의 반을 입력하세요 : ");
		int classNum=sc.nextInt();
		std.setClassNum(classNum);
		
		System.out.print("학생의 번호를 입력하세요 : ");
		int num=sc.nextInt();
		std.setNum(num);
		
		System.out.print("과목 정보를 입력하시겠습니까?(y/n) :");
		char haveSub=sc.next().charAt(0);
		
		switch(haveSub) {
		
		case 'y':
			
			System.out.print("과목 수를 입력하세요 : ");
			int subNum=sc.nextInt();
			Subject[] subArr=new Subject[subNum];
			for(int i=0; i<subNum; i++) {
				
				System.out.print("과목 이름을 입력하세요 : ");
				String title=sc.next();
								
				System.out.print(title+"의 중간고사 점수를 입력하세요 : ");
				int midterm=sc.nextInt();
								
				System.out.print(title+"의 기말고사 점수를 입력하세요 : ");
				int finals=sc.nextInt();
				
				System.out.print(title+"의 수행평가 점수를 입력하세요 : ");
				int performance=sc.nextInt();
				
				System.out.print(title+"의 출석 점수를 입력하세요 : ");
				int attendance=sc.nextInt();
				
				subArr[i]=new Subject(title, midterm, finals, performance, attendance);
				std.setScore(subArr[i]);
			}
			std.printStdinfo();
			std.printScore();
			return 0;
						
		case 'n':
			System.out.println("과목 정보가 없습니다.");
			std.printStdinfo();
			return 1;
		
		default:
			System.out.println("잘못된 입력입니다.");
			std.printStdinfo();
			return 2;
		}
		
		
	}
	
	public void modifyStudent(Student[] arr, Student std) {
		System.out.print("수정할 학생의 이름을 입력하세요 : ");
		String name=sc.next();
		for(int i=0; i<arr.length; i++)
			if(name.equals(arr[i].getName())) {
				
			}
	}

	
	public int deleteStudent(Student[] arr, Student std) {
		return 0;
		
	}

	
	public void printStudent(Student[] arr, Student std) {
		
	}

}
