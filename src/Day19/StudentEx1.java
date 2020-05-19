package Day19;

import java.util.*;

public class StudentEx1 {
	
//	아래 Student 클래스를 이용하여 학생 관리 프로그램을 만들려고 한다.
//	기능은 학생 정보 추가, 학생 정보 수정, 학생 정보 삭제가 있다.
//	이 때 필요한 메소드를 선언부만 정의하시오 (구현 X)
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> sList=new ArrayList<Student>();
		int menu=0;
				
		while(menu!=5) {
			printMenu();
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				if(insStdnt(inStdnt(sc), sList)) {
					System.out.println("학생 정보가 입력되었습니다.");
					System.out.println();
					break;
				}
				System.out.println("학생 정보가 입력되지 않았습니다.");
				System.out.println();
				break;
				
			case 2:
				if(modStdnt(inStdnt(sc), sList)) {
					System.out.println("학생 정보가 수정되었습니다.");
					System.out.println();
					break;
				}
				System.out.println("학생 정보가 수정되지 않았습니다.");
				break;
				
			case 3:
				if(delStdnt(srchNum(sc), sList)) {
					System.out.println("학생 정보가 삭제되었습니다.");
					System.out.println();
					break;
				}
				System.out.println("학생 정보가 삭제되지 않았습니다.");
				System.out.println();
				break;
				
			case 4:
				prntList(sList);
				System.out.println();
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
				
			default:
				System.out.println("잘못된 메뉴입니다.");
			}	
		}
				
		sc.close();
	}
	
	public static void printMenu() {
		System.out.println("----메뉴----");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴를 입력하세요 : ");
	}

//	기능 : 학생정보를 입력받으면 학생 정보를 가진 인스턴스를 반환하는 메소드
//	매개변수 : 스캐너
//	리턴타입 : void
//	메소드명 : inputInfo
	
	public static Student inStdnt(Scanner sc) {
		Student s=new Student();
		
		System.out.println();
		
		System.out.print("학번을 입력하세요 : ");
		s.setNum(sc.next());
		
		System.out.print("이름을 입력하세요 : ");
		s.setName(sc.next());
		
		System.out.print("전공을 입력하세요 : ");
		s.setMajor(sc.next());
		
		System.out.print("학년을 입력하세요 : ");
		s.setGrade(sc.next());
						
		return s;
	}
	
//	기능 : 
//	매개변수 : 
//	리턴타입 : 
//	메소드명: insertStd
	
	public static boolean insStdnt(Student s, List<Student> sList) {
		if(s==null || sList==null) {
			return false;
		}
				
//		List의 메서드는 equals를 호출하여 리스트 내부 객체들을 비교하므로
//		클래스에서 equals 메서드를 원하는 형태로 구현해야 정상적으로 사용 가능하다.
		if(sList.contains(s)) {
			return false;
		}
		
		sList.add(s);
		return true;
	}
	
//	기능 : 학번을 입력받으면 학생셋에서 해당 학번을 인스턴스를 찾아 스캐너로 입력받아 인스턴스를 수정하는 메소드
//	매개변수 : 학생인스턴스, 학생셋, 스캐너
//	리턴타입 : boolean
//	메소드명: modifyInfo
	
	public static boolean modStdnt(Student s, List<Student> sList) {
		delStdnt(s, sList);
		
		sList.add(s);
		return true;
	}
	
//	기능 : 학생과
//	매개변수 : 인스
//	리턴타입 : void(매개변수인 학생 클래스의 인스턴스가 참조변수이므로)
//	메소드명: deleteInfo
	
	public static boolean delStdnt(Student s, List<Student> sList) {
		if(s==null || sList==null) {
			return false;
		}
		
		if(!sList.contains(s)) {
			return false;
		}
		
		sList.remove(s);
		return true;
	}
	
	public static Student srchNum(Scanner sc) {
		System.out.print("학번을 입력하세요 :");
		String num=sc.next();
		
		Student s=new Student();
		s.setNum(num);
		
		return s;
	}
	
	public static void prntList(List<Student> sList) {
		if(sList==null || sList.size()==0) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		System.out.println("학번, 이름, 전공, 학년");
		for(Student tmp:sList) {
			System.out.println(tmp);
		}
	}

}

class Student {
	String num; // 학번 => 고유번호 (중복 X)
	String name; // 이름
	String major; // 전공
	String grade; // 학년
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return num+", "+name+", "+major+", "+grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, String num, String major, String grade) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	
	
	
}