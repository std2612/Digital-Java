package AccountBook;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashBookMain {

	public static void main(String[] args) {
		List<CashBook> list=new ArrayList<CashBook>();
		Scanner sc=new Scanner(System.in);
		regcb(new CashBook(1, "2020-05-22", "식비", "점심", 5000), list);
		regcb(new CashBook(1, "2020-05-21", "식비", "점심", 5000), list);
		regcb(new CashBook(1, "2020-05-22", "교통비", "버스", 1400), list);
		regcb(new CashBook(1, "2020-05-22", "월급", "청주학원", 1000000), list);
		int cnt=1;
		for(CashBook tmp : list) {
			System.out.println(cnt+++". "+tmp);
		}
		
		modifyCashBook(list, 4, new CashBook(1, "2020-05-23", "식비", "점심", 5000));
		cnt=1;
		for(CashBook tmp : list) {
			System.out.println(cnt+++". "+tmp);
		}
		sc.close();
	}
	
//	기능 : 주어진 가계부 내역(CashBook)을 가계부(list)에 저장하는 메소드
//	매개변수 : CashBook cb, List<CashBook> list
//	리턴타입 : void
//	메소드명 : regcb

	public static void regcb(CashBook cb, List<CashBook> list) {
		if(list==null || cb==null) {
			return;
		}
		list.add(cb);
		list.sort(new Comparator<CashBook>() {

			@Override
			public int compare(CashBook o1, CashBook o2) {
//				int year1=Integer.parseInt(o1.getDate().substring(0, 4));
//				int year2=Integer.parseInt(o2.getDate().substring(0, 4));
//				int month1=Integer.parseInt(o1.getDate().substring(5, 7));
//				int month2=Integer.parseInt(o2.getDate().substring(5, 7));
//				int day1=Integer.parseInt(o1.getDate().substring(8, 10));
//				int day2=Integer.parseInt(o2.getDate().substring(8, 10));
				String[] arr1=o1.getDate().split("-");
				String[] arr2=o2.getDate().split("-");
				for(int i=0; i<arr1.length; i++) {
//					arr의 0번지 : 년
//					arr의 1번지 : 월
//					arr의 2번지 : 일
					if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) {
						return -1;
					}else if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) {
						return 1;
					}
				}
				return 0;
			}
		});
	}
	
//	기능 : 스캐너를 통해 가계부 내역을 입력받아 가계부 내열을 반환하는 메소드
//	매개변수 : Scanner sc
//	리턴타입 : CashBook
//	메소드명 : createcb
	
	public static CashBook createcb(Scanner sc) {
		System.out.print("수입(0), 지출(1) : ");
		int inEx=sc.nextInt();
		
		Pattern p=Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher m;
		
		String date;
		do {
			System.out.print("날짜 ex)2020-01-01 : ");
			date=sc.next();
			m=p.matcher(date);
		}while(!m.matches());
		
		System.out.print("분류 : ");
		String type=sc.next();
		
		System.out.print("내용 : ");
		String content="";
		while((content=sc.nextLine()).trim().length()==0);
		
		System.out.print("금액 (원) : ");
		int money=sc.nextInt();
				
		CashBook cb=new CashBook(inEx, date, type, content, money);
				
		return cb;
	}
	
//	기능: 가계부에서 확인하려는 종류에 맞는 검색 결과를 리스트로 반환하는 메소드
//	매개변수 : List<CashBook> list, int kind, String search
//		kind = 1 : 날짜 기준 분류
//		kind = 2 : 수입/지출 기분 분류
//		kind = 3 : type 기준 분류
//	리턴타입 : List<CashBook>
//	메소드명 : searchCashBook
	
	public static List<CashBook> searchCashBook(List<CashBook> list, int kind, String search){
		List<CashBook> searchList=new ArrayList<CashBook>();
		switch(kind) {
		case 1:
			Pattern p=Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
			Matcher m=p.matcher(search);
			if(!m.matches()) {
				System.out.println("날짜 형태의 검색어가 아닙니다.");
				return null;
			}
			
			for(CashBook tmp : list) {
				if(tmp.getDate().equals(search)) {
					searchList.add(tmp);
				}
			}
			
			return searchList;
			
		case 2:
			if(!search.equals("수입") && !search.equals("지출")) {
				System.out.println("검색어는 수입 또는 지출이어야 합니다.");
				return null;
			}
			
			boolean isIncome=search.equals("수입");
			for(CashBook tmp : list) {
				if(tmp.isInEx() == isIncome) {
					searchList.add(tmp);
				}
			}
			
			return searchList;
		
		case 3:
			for(CashBook tmp : list) {
				if(tmp.getType().equals(tmp)) {
					searchList.add(tmp);
				}
			}
			
			return searchList;
		}
		return null;
	}
	
//	기능 : 가계부에서 수정할 인덱스를 알려주면 수정 항목을 수정하는 메소드 
//	리턴타입 : boolean, void
//	메소드명 : modifyCashBook
//	매개변수 : List<CashBook> list, int index, CashBook cb
	
	public static boolean modifyCashBook(List<CashBook> list, int index, CashBook cb) {
		if(list==null || list.size() < index) {
			return false;
		}
		list.remove(index-1);
		regcb(cb, list);
		return true;
	}
		
}
