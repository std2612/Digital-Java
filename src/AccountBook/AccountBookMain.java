package AccountBook;

import java.util.*;

public class AccountBookMain {

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
				if(modifiyHistory(ab, sc)) {
					System.out.println("수정되었습니다.");
					
				}else {
					System.out.println("수정되지 않았습니다.");
				}
				System.out.println();
				break;
				
			case '3':
				printSelectHistory(ab, sc);
				System.out.println();
				break;
				
			case '4':
				System.out.println("종료합니다.");
				System.out.println();
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
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
		
		Collections.sort(ab.hList, new Comparator<History>() {
            @Override
            public int compare(History h1, History h2) {
                if (h1.getDate() < h2.getDate()) {
                    return -1;
                } else if (h1.getDate() > h2.getDate()) {
                    return 1;
                }
                return 0;
            }
        });
		
		for(int i=0; i<ab.hList.size(); i++) {
			ab.hList.get(i).setNum(i+1);
		}
		
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
		
		Collections.sort(ab.hList, new Comparator<History>() {
            @Override
            public int compare(History h1, History h2) {
                if (h1.getDate() < h2.getDate()) {
                    return -1;
                } else if (h1.getDate() > h2.getDate()) {
                    return 1;
                }
                return 0;
            }
        });
		
		for(int i=0; i<ab.hList.size(); i++) {
			ab.hList.get(i).setNum(i+1);
		}
		
		return true;
	}
	
	public static void printAllHistory(AccountBook ab) {
		
	}
	
	public static void printSelectHistory(AccountBook ab, Scanner sc) {
		System.out.println("최종 금액 : "+finalMoney(ab));
		
		char menu=0;
		
		while(menu!='4') {
		
			System.out.println("확인 기준");
			System.out.println("1. 날짜");
			System.out.println("2. 수입, 지출");
			System.out.println("3. 분류");
			System.out.println("4. 이전 메뉴로");
			System.out.print("입력 : ");
			menu=sc.next().charAt(0);
			
			switch(menu) {
			case '1':
				System.out.println();
				System.out.println(ab.hList);
				break;
				
			case '2':
				System.out.println();
				List<History> tmp=new ArrayList<History>();
				tmp.addAll(ab.hList);
				Collections.sort(tmp, new Comparator<History>() {
		            @Override
		            public int compare(History h1, History h2) {
		                if (h1.getInEx()==true && h2.getInEx()==false) {
		                    return -1;
		                } else if (h1.getInEx()==false && h2.getInEx()==true) {
		                    return 1;
		                } else
		                return 0;
		            }
		        });
				
				System.out.println(tmp);
				break;
			case '3':
				System.out.println();
				List<History> tmp2=new ArrayList<History>();
				tmp2.addAll(ab.hList);
				Collections.sort(tmp2, new Comparator<History>() {
		            @Override
		            public int compare(History h1, History h2) {
		            	return h1.getContent().compareTo(h2.getContent());
		            }
		        });
				
				System.out.println(tmp2);
				break;
			case '4':
				break;
			default:
			}
			System.out.println("");
		}
		
	}
	
	public static int finalMoney(AccountBook ab) {
		int fm, inSum=0, exSum=0;
		
		for(History tmp:ab.hList) {
			if(tmp.inEx){
				inSum+=tmp.sum;
			}else {
				exSum+=tmp.sum;
			}
		}
		
		fm=ab.money+inSum-exSum;
		
		return fm;
	}

}

class History {
	int num;
	int date;
	String content;
	int sum;
	boolean inEx;
	
	public History(int date, String content, boolean inEx, int sum) {
		super();
		this.date = date;
		this.content = content;
		this.sum = sum;
		this.inEx = inEx;
	}

	public History() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
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
		result = prime * result + num;
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
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str="";
		if(inEx) {
			str+="수입, ";
		}else {
			str+="지출, ";
		}
		return "\n"+num+". "+str+", 날짜 : "+date+ ", 내용 : "+content+", 금액 : "+sum+"\n";
	}

}
