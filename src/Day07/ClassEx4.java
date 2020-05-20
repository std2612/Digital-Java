package Day07;

import java.util.Date;

public class ClassEx4 {

	public static void main(String[] args) {
		Student.printAcaInfo();
		Student s1=new Student();
		s1.printStuInfo();
		Student.printAcaInfo();
		Student s2=new Student("오영규", "자바");
		s2.printStuInfo();
		Student.printAcaInfo();
		s2.enter();
		s2.printStuInfo();
		s2.quit();
		s2.printStuInfo();
				
	}

}
class Student{
	// 클래스변수
	private static String academy="그린컴퓨터아트학원";
	private static int stuNum=0;
	// 객체변수
	private String name;
	private boolean isEnter;
	private String course;
	private int attenDays=0;
	private Date inTime;
	private Date outTime;
	// 생성자
	public Student() {
		course="자바";
		name="홍길동";
		stuNum++;
	}
	public Student(String name,String course) {
		this.name=name;
		this.course=course;
		stuNum++;
	}
	// 클래스 메소드
	public static void printAcaInfo() {
		System.out.println("학원 이름 : "+academy);
		System.out.println("학생 수 : "+stuNum);
		System.out.println();
	}
	// 객체 메소드
	public void enter() {
		inTime=new Date();
		isEnter=true;
		System.out.println(name+"님이 입실하였습니다.");
		System.out.println("입실 시간 : "+inTime);
		System.out.println();
	}
	public void quit() {
		outTime=new Date();
		isEnter=false;
		System.out.println(name+"님이 퇴실하였습니다.");
		System.out.println("입실 시간 : "+outTime);
		System.out.println();
		attenDays++;
	}
	public void printStuInfo() {
		System.out.println("학생 이름 : "+name);
		if(isEnter==true) {
			System.out.println("입실 여부 : O");
		}
		if(isEnter==false) {
			System.out.println("입실 여부 : X");
		}
		System.out.println("수강 과정 : "+course);
		System.out.println("출석 일수 : "+attenDays);
		System.out.println();
	}
	

}
