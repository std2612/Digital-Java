package Day21;

import java.util.*;

public class AccountBookEx1 {

	public static void main(String[] args) {
		AccountBook ab=new AccountBook();
		Scanner sc=new Scanner(System.in);
		System.out.print("가계부의 시작 금액을 입력하세요 : ");
		int startMoney=sc.nextInt();
		ab.setStartMoney(startMoney);
		char menu='0';
		
		while(menu!='4') {
			printMenu();
			menu=sc.next().charAt(0);
			System.out.println();
			switch(menu) {
			case '1':
				System.out.println("입출 내역을 작성해주세요.");
				if(insertHistory(ab, inputHistory(sc))) {
					System.out.println("등록되었습니다.");
					
				}else {
					System.out.println("등록되지 않았습니다.");
				}
				System.out.println();
				break;
				
			case '2':
				modifiyHistory(ab, sc);
				break;
				
			case '3':
				System.out.println(ab);
				break;
				
			case '4':
				System.out.println("종료합니다.");
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		sc.close();
		
	}
	
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 확인");
		System.out.println("4. 종료");
		System.out.print("입력 : ");
	}
	
	public static History inputHistory(Scanner sc) {
		History h=null;
		
		System.out.print("날짜 ex)20200101 : ");
		int date=sc.nextInt();
		
		System.out.print("내용 : ");
		String content="";
		while((content=sc.nextLine()).trim().length()==0);
		
		int tmpMenu=0;
		boolean inEx = true;
		while(tmpMenu!=1 && tmpMenu!=2) {
			System.out.println("1. 수입");
			System.out.println("2. 지출");
			System.out.print("입력 : ");
			tmpMenu=sc.nextInt();
			
			switch(tmpMenu) {
			case 1:
				inEx=true;
				break;
			case 2:
				inEx=false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
				
		System.out.print("금액을 입력하세요 : ");
		int money=sc.nextInt();
		
		h=new History(date, content, inEx, money);
				
		return h;
	}
	
	public static boolean insertHistory(AccountBook ab, History h) {
		if(ab==null || h==null) {
			return false;
		}
		
		ab.hList.add(h);
		return true;
		
	}
	
	public static boolean modifiyHistory(AccountBook ab, Scanner sc) {
		if(ab==null) {
			return false;
		}
		
		System.out.println("수정할 입출내역을 입력하세요.");
		History tmp=inputHistory(sc);
		
		if(!ab.hList.contains(tmp)) {
			return false;
		}
		
		ab.hList.remove(tmp);
		
		System.out.println("수정된 입출내역을 입력하세요.");
		ab.hList.add(inputHistory(sc));
		
		return true;
	}
	
	public static void printAllHistory(AccountBook ab) {
		
	}
	
	public static void printSelectHistory(AccountBook ab) {
		
	}

}

class AccountBook {
	int money;
	List<History> hList=new ArrayList<History>();
	
	public int getMoney() {
		return money;
	}

	public void setStartMoney(int money) {
		this.money = money;
	}

	public List<History> gethList() {
		return hList;
	}

	public void sethList(List<History> hList) {
		this.hList = hList;
	}

	public AccountBook() {
		super();
	}

	@Override
	public String toString() {
		return "현재 금액 : "+money+"\n내역\n"+hList;
	}
			
}

class History {
	int date;
	String content;
	int income;
	boolean inEx;
	
	public History(int date, String content, boolean inEx, int income) {
		super();
		this.date = date;
		this.content = content;
		this.income = income;
		this.inEx = inEx;
	}

	public History() {
		super();
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public boolean getInEx() {
		return inEx;
	}

	public void setInEx(boolean inEx) {
		this.inEx = inEx;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + date;
		result = prime * result + (inEx ? 1231 : 1237);
		result = prime * result + income;
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
		History other = (History) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (date != other.date)
			return false;
		if (inEx != other.inEx)
			return false;
		if (income != other.income)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str="\n";
		if(inEx) {
			str+="수입, ";
		}else {
			str+="지출, ";
		}
		return str+"날짜 : "+date+ ", 내용 : "+content+", 금액 : "+income;
	}
	
}
