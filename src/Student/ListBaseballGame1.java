package Student;

import java.util.*;

public class ListBaseballGame1 {
	static int size=3;
	static int min=1, max=9;
	static Scanner sc=new Scanner(System.in);
		
//	1. 컴퓨터가 생성한 랜덤한 수를 저장하는 리스트 생성 : com
	static List<Integer> com=new ArrayList<Integer>(size);
			
	public static void main(String[] args) {
		int strike=0, ball=0;
		
//		2. 사용자가 입력한 수를 저장하는 리스트 생성 : user
		List<Integer> user=new ArrayList<Integer>(size);
		
//		3. 중복되지 않는 랜덤한 수 3개를 com에 저장
		createComList();
		
		System.out.println(com);
		
//		4. 사용자가 수 3개를 입력하여 맞출 때까지 반복
//		4-1. 스트라이크 갯수가 3개가 될 때까지 반복
		while(strike!=size) {
//			4-2. 정수 세 개를 입력받아 중복된 애용이 있으면 다시 입력받게 함
			user.clear();
			
			if(!insertUser(user)) {
				System.out.printf("입력한 숫자 중에 중복된 숫자가 있거나 입력된 숫자가 %d~%d사이의 숫자가 아닙니다.%n",min, max);
				continue;
			}
			System.out.println(user);
			
//			4-3. 스트라이크와 볼을 판별
			strike=0;
			ball=0;
			strike=strike(user);
			
			ball=ball(user);
			
//			4-4. 판별한 스트라이크와 볼을 이용하여 출력
			System.out.print("결과 : ");
			
			if(strike!=0) {
				System.out.print(strike+" Strike ");
			}
			
			if(ball!=0) {
				System.out.print(ball+" Ball ");
			}
			
			if(strike==0 && ball==0) {
				System.out.print(size+" Out ");
			}
			
			System.out.println();
						
		}
		
		System.out.println("정답입니다. 프로그램을 종료합니다.");
		sc.close();
	}
	
	public static int random() {
		if(min>max) {
			throw new ArithmeticException("예외 발생 : 최대값과 최소값의 순서가 바뀌었습니다.");
		}
		return new Random().nextInt(max-min+1)+1;
	}
	
//	기능 : 중복되지 않는 랜덤 수 3개의 객체를 가진 리스트 생성
//	매개변수 : 리스트, 리스트 사이즈, 최소값, 최대값
//	리턴타입 : 배열이 매개 변수로 들어가므로 void
//	메소드명 : createComList
	
	public static void createComList() {
		if(size>max-min+1) {
			throw new ArithmeticException("랜덤 수의 범위 보다 만들어야하는 갯수가 더 많습니다.");
		}
		while(size>com.size()) {
			Integer r=random();
			if(!com.contains(r)) {
				com.add(r);
			}
		}
	}
	
//	기능 : 스캐너를 통해 정수를 입력받아 입력받은 정수가 1~9사이이고 중복되지 않으면 리스트에 저장한 후 리스트 생성 여부를 알려주는 메서드
//	매개변수 : 스캐너, 최소값, 최대값, 리스트
//	리턴타입 : boolean
//	메서드명 : createUserList
	
	public static boolean insertUser(List<Integer> user) {
		int i=0;
		System.out.printf("중복되지 않는 숫자 %d개를 입력하세요(%d~%d) : ",size ,min, max);
		while(i++<size) {
			user.add(sc.nextInt());
		}
		i=0;
		List<Integer> tmpList=new ArrayList<Integer>();
		while(user.size()!=0) {
			int tmp=user.remove(0);
			
//			입력된 수가 min보다 작거나 max보다 크거나 중복이 되면
			if(tmp<min || tmp>max || user.contains(tmp)) {
				return false;
			}
			tmpList.add(tmp);
		}
//		user=tmpList; // 이렇게 작성하면 원본에 tmpList값이 추가되지 않음
		user.addAll(tmpList);
		return true;
	}
	
	public static void createUserList(List<Integer> user) {
		while(user.size()<size) {
			Integer i=sc.nextInt();
			if(user.contains(i)) {
				System.out.println("중복된 수가 추가되지 않았습니다.");
			}
			if(!user.contains(i)) {
				user.add(user.size(), i);
			}
		}
	}
	
	public static int strike(List<Integer> user) {
		int cnt=0;
		for(int i=0; i<size; i++) {
			if(com.get(i)==user.get(i)) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static int ball(List<Integer> user) {
		int cnt=0;
		for(int j=0; j<size; j++) {
			if(com.contains(user.get(j))) {
				cnt++;
			}
		}
		return cnt-strike(user);
	}

}
