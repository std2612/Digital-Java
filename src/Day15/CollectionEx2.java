package Day15;

import java.util.*;

public class CollectionEx2 {
//	오늘이 할 일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요.
//	Ex)
//	오늘의 할 일을 추가하시겠습니까?(y/n) : y
//	오늘의 할 일을 추가하세요 : 수업
//	오늘의 할 일을 추가하시겠습니까?(y/n) : y
//	오늘의 할 일을 추가하세요 : 점심
//	오늘의 할 일을 추가하시겠습니까?(y/n) : n
//	오늘의 할 일
//	1. 수업
//	2. 점심
//	프로그램을 종료합니다.
	public static void main(String[] args) {
		ArrayList<Work> schedule = new ArrayList<Work>();
		Scanner s=new Scanner(System.in);
		
		char haveWork='y';
		while(haveWork=='y' || haveWork=='Y') {
			System.out.print("오늘의 할 일을 추가하시겠습니까?(y/n) : ");
			haveWork=s.next().charAt(0);
			s.nextLine();
			switch(haveWork) {
			case 'y':	case 'Y':
				System.out.print("오늘의 할 일을 입력하세요 : ");
				schedule.add(new Work(s.nextLine()));
				break;
			case 'n':	case 'N':
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				haveWork='y';
			}
		}
		
		System.out.println("오늘이 할 일");
		printSchedule(schedule);
		System.out.println("프로그램을 종료합니다.");
		s.close();
		
		
		
	}
	private static void printSchedule(ArrayList<Work> schedule) {
		for(int i=0; i<schedule.size(); i++) {
			System.out.printf("%d. %s%n",i+1, schedule.get(i));
		}
		
	}

}
class Work {
	String name;

	public Work(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
