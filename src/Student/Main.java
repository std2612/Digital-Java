package Student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int menu=0;
		Student tmpStd;
		int size=30;
		Student[] std=new Student[size];
		int cnt=0; // 현재까지 저장된 학생 수
		String name;
		
		while(menu!=5) {
			printMenu();
			menu=sc.nextInt();
			
			//메뉴 구성
			switch(menu) {
			
//			학생 정보 입력
			case 1:
				
				// 학생정보 입력 받기
				System.out.println("추가할 학생의 정보를 입력하세요.");
				tmpStd=searchInfo(sc);
				System.out.print("이름을 입력하세요 : ");
				name=sc.next();
				tmpStd.setName(name);
				if(isDup(std, tmpStd, cnt)!=-1) {
					System.out.println("이미 있는 학생입니다.");
					break;
				}
				
				std[cnt]=tmpStd;
				
				// 과목정보 입력 받기
				System.out.print("과목 정보를 입력하시겠습니까?(y/n) : ");
				char addSub=sc.next().charAt(0);
				switch(addSub) {
				case 'y':	case 'Y':
					inputSub(sc, std[cnt]);
					cnt++;
										
					break;
					
				case 'n':	case 'N':
					System.out.println("과목 정보를 입력받지 않았습니다.");
					cnt++;
					break;
					
				default:
					System.out.println("잘못된 입력입니다.");
					cnt++;
							
				}
				
				tmpStd=null;
								
				break;
			
//			학생 정보 수정
			case 2:
				
				modifyStd(sc, std, cnt);
								
				break;
			
//			학생 정보 삭제
			case 3:
				System.out.println("삭제할 학생의 정보를 입력하세요.");
				tmpStd=searchInfo(sc);
				cnt=deleteStd(std, tmpStd, cnt);
				tmpStd=null;

				break;
			
//			학생 정보 출력
			case 4:
				printStudent(std,cnt);
				break;
			
//			프로그램 종료
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");	
			}
		}
	}
	public static void printMenu() {
		System.out.println("-메뉴-");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 종료");
		System.out.println("------------");
		System.out.print("메뉴 번호를 입력하세요 : ");
	}
	public static Student searchInfo(Scanner sc){
		System.out.print("학생의 학년을 입력하세요 : ");
		int grade=sc.nextInt();
		
		System.out.print("학생의 반을 입력하세요 : ");
		int classNum=sc.nextInt();
		
		System.out.print("학생의 번호를 입력하세요 : ");
		int num=sc.nextInt();
		
		Student s=new Student();
		s.setGrade(grade);
		s.setClassNum(classNum);
		s.setNum(num);
		return s;
	}
	/* 리턴타입
	 * void : 
	 * int : 삭제된 뒤의 학생 수
	 * boolean : 삭제 여부
	 * 매개변수
	 * int cnt : 현재 학생수
	 * Student[] std : 저장된 학생 정보
	 * Student s : 삭제할 학생 정보 */
	public static int deleteStd(Student[] std, Student dltStd, int cnt) {
		// 입력된 학생 정보와 중복되는 정보가 있는지 탐색
		if(std==null || dltStd==null || cnt<=0)
			return cnt;
		
		int pos=isDup(std ,dltStd , cnt);
		
		if(pos!=-1) {
			for(int j=0; j<cnt-1; j++) {
				std[j]=std[j+1];
			}
			System.out.println("삭제가 완료되었습니다.");
			return --cnt;
		}
			
		return cnt;
		
	}
	// boolean형 삭제
	public static boolean deleteStd2(Student[] std, Student dltStd, int cnt) {
		if(std==null || dltStd==null || cnt<=0)
			return false;
		
		int pos=isDup(std ,dltStd , cnt);
		
		if(pos!=-1) {
			for(int j=0; j<cnt-1; j++) {
				std[j]=std[j+1];
			}
			System.out.println("삭제가 완료되었습니다.");
			return true;
		}
		return false;
	}
	
	public static void printStudent(Student[] prtStd, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.println("------------");
			System.out.println("학년 : "+prtStd[i].getGrade());
			System.out.println("반 : "+prtStd[i].getClassNum());
			System.out.println("번호 : "+prtStd[i].getNum());
			System.out.println("이름 : "+prtStd[i].getName());
			System.out.println("------------");
			if(prtStd[i].score!=null)
				prtStd[i].printScore();
			
		}
	}
	/* 기능 : 콘솔에서 정보를 입력받고 입력받은 정보를 통해 과목들을 저장하고 저장한 과목을 */
	public static void inputSub(Scanner sc, Student s) {
		System.out.print("입력할 과목 수를 입력하세요 : ");
		int subNum=sc.nextInt();
		Subject[] subList=new Subject[subNum];
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
						
			subList[i]=new Subject(title, midterm, finals, performance, attendance);
		}
		
		if(s==null)
			return;
		
		s.setScore(subList);
	}
	
//	public static void modifyStd(Scanner sc, Student[] std, Student mdfStd, int cnt) {
//		if(std==null || mdfStd==null || cnt<=0)
//			return;
//		for(int i=0; i<cnt; i++) {
//			if(std[i].equal2(mdfStd)) {
//				System.out.println("-수정 메뉴-");
//				System.out.println("1. 학년 수정");
//				System.out.println("2. 반 수정");
//				System.out.println("3. 번호 수정");
//				System.out.println("4. 이름 수정");
//				System.out.println("5. 과목 수정");
//				System.out.print("메뉴 번호를 입력하세요 : ");
//				int change=sc.nextInt();
//				
//				if(change==1) {
//					System.out.print("몇 학년으로 수정할지 입력하세요 : ");
//					int grade=sc.nextInt();
//					std[i].grade=grade;
//				}
//				if(change==2) {
//					System.out.print("몇 반으로 수정할지 입력하세요 : ");
//					int classNum=sc.nextInt();
//					std[i].classNum=classNum;
//				}
//				if(change==3) {
//					System.out.print("몇 번으로 수정할지 입력하세요 : ");
//					int num=sc.nextInt();
//					std[i].num=num;
//				}
//				if(change==4) {
//					System.out.print("어떤 이름으로 수정할지 입력하세요  : ");
//					String name=sc.next();
//					std[i].name=name;
//				}
//				if(change==5) {
//					if(std[i].score==null) {
//						System.out.println("과목 정보가 없습니다.");
//						System.out.print("과목 정보를 입력하시겠습니까?(y/n) : ");
//						char addSub=sc.next().charAt(0);
//						switch(addSub) {
//						case 'y':	case 'Y':
//							inputSub(sc, mdfStd);
//							
//												
//							break;
//							
//						case 'n':	case 'N':
//							System.out.println("과목 정보를 입력받지 않았습니다.");
//							break;
//							
//						default:
//							System.out.println("잘못된 입력입니다.");
//							
//									
//						}
//					}
//					if(std[i].score!=null) {
//							modifySub(sc, std[i], std[i].score, std[i].score.length);
//						}	
//					}
//				return;
//				}
//			
//			}
//	
//		System.out.println("일치하는 학생 정보가 없습니다.");
//		return;
//	}
//			
//			
//				
//		
//	
//	public static void modifySub(Scanner sc, Student s, Subject[] subList, int subNum) {
//		if(subList!=null) {
//			System.out.print("과목을 추가하려면 a, 수정하려면 m을 입력하세요 : ");
//			char addOrModify=sc.next().charAt(0);
//			if(addOrModify=='a') {
//				
//			}
//			if(addOrModify=='m') {
//				
//			}
//		}
//		
//	}
	/* 리턴타입
	 * int : 중복되면 중복된 번지를 알려주고, 중복 안되면 -1을 반환
	 * boolean : 중복되면 true, 아니면 false
	 * 매개변수
	 * Student[] std
	 * Student tmpStd
	 * int cnt
	 * */
	public static int isDup(Student[] std, Student tmpStd, int cnt) {
		for(int i=0; i<cnt; i++) {
			if(std[i].equal2(tmpStd)) {
				return i;
			}
		}
		return -1;
	}
	/* 리턴타입
	 * void
	 * 매개변수
	 * Student[] std
	 * int cnt
	 *  */
	public static void modifyStd(Scanner sc, Student[] std, int cnt) {
		System.out.println("수정할 학생의 정보를 입력하세요.");
		Student tmpStd=searchInfo(sc);
		int pos=isDup(std, tmpStd, cnt);
		if(pos==-1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		System.out.print("이름을 입력하세요 : ");
		String name=sc.next();
		tmpStd.setName(name);
		System.out.println("-과목 수정 메뉴-");
		System.out.println("1. 수정");
		System.out.println("2. 추가");
		System.out.println("3. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int mdfSub=sc.nextInt();
		
		switch(mdfSub) {
		case 1:
			// 해당 학생의 과목 정보를 가져옴
			Subject[] sList=std[pos].getScore();
			// 수정할 과목이 있는지 찾기, 있으면 아래 작업을하고, 없으면 종료
			if(sList==null) {
				System.out.println("수정할 과목이 없습니다.");
				break;
			}
			// 수정할 과목을 입력
			System.out.print("수정할 과목 이름을 입력하세요 : ");
			String title=sc.next();
			int subPos=-1;
			for(int i=0; i<sList.length; i++)	{
				if(sList[i].getTitle().equals(title)) {
					subPos=i;
					break;
				}
			}
			if(subPos==-1) {
				System.out.println("등록되지 않은 과목입니다.");
				break;
			}
			
			// 중간,기말,수행,출석 새로 입력
			System.out.print(title+"의 중간고사 점수를 입력하세요 : ");
			int midterm=sc.nextInt();
							
			System.out.print(title+"의 기말고사 점수를 입력하세요 : ");
			int finals=sc.nextInt();
			
			System.out.print(title+"의 수행평가 점수를 입력하세요 : ");
			int performance=sc.nextInt();
			
			System.out.print(title+"의 출석 점수를 입력하세요 : ");
			int attendance=sc.nextInt();
						
			sList[subPos].setAttendance(attendance);
			sList[subPos].setFinals(finals);
			sList[subPos].setMidterm(midterm);
			sList[subPos].setPerformance(performance);
			
			break;
		case 2:
			Student s=new Student();
			inputSub(sc, s);
			std[pos].addScore(s.getScore());
			break;
		}
	}
}
