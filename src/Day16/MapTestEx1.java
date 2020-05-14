package Day16;

import java.util.*;

public class MapTestEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> account=new HashMap<String, String>();
		int menu=0;
		while(menu!=4) {
			printMenu();
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				inputAcc(sc, account);
				break;
			case 2:
				searchAcc(sc, account);
				break;
			case 3:
				modifyPW(sc, account);
				break;
			case 4:
				System.out.println("종료합니다.");
				sc.close();
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	public static void inputAcc(Scanner sc, Map<String, String> account){
		System.out.print("ID : ");
		String id=sc.next();
		System.out.print("PW : ");
		String pw=sc.next();
		account.put(id, pw);
	}
	
	public static void searchAcc(Scanner sc, Map<String, String> account) {
		System.out.print("ID : ");
		String id=sc.next();
		
		if(!account.containsKey(id)) {
			System.out.println(id+" 는 없는  ID입니다.");
		}
		
		if(account.containsKey(id)) {
			System.out.printf("%s 의  PW는 %s 입니다%n",id ,account.get(id));
		}
	}
	
	public static void modifyPW(Scanner sc, Map<String, String> account) {
		System.out.print("ID : ");
		String id=sc.next();
		if(!account.containsKey(id)) {
			System.out.println(id+" 는 없는  ID입니다.");
		}
		if(account.containsKey(id)) {
			System.out.print("PW(now) : ");
			String nowpw=sc.next();
			System.out.print("PW(new) : ");
			String newpw=sc.next();
			
			if(!nowpw.equals(account.get(id))) {
				System.out.println("비밀번호 수정에 실패했습니다.");
			}
			else {
				account.replace(id, account.get(id) , newpw);
				System.out.println("비밀번호 수정에 성공했습니다.");
			}
		}
	}
}
