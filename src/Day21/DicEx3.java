package Day21;

import java.util.*;

public class DicEx3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Word> dic=new ArrayList<Word>();
		Word w=null; // 추가, 수정, 삭제, 검색에서 사용할 임시 단어
		char menu='1'; // 선택된 메뉴
		
		do {
			printMenu();
			menu=sc.next().charAt(0);
			switch(menu) {
			case '1':
				System.out.println();
				System.out.println("추가할 단어와 품사와 의미를 입력하세요.");
				w=inputAllWord(sc);
				System.out.println();
				if(insertWord(dic, w)) {
					System.out.println("단어장에 단어를 추가했습니다.");
				}else {
					System.out.println("단어장에 단어를 추가하지 못했습니다.");
				}
				System.out.println();
				break;
			case '2':
				System.out.println();
				System.out.println("수정할 단어와 품사와 의미를 입력하세요.");
				w=inputAllWord(sc);
				System.out.println();
				if(modifyWord(dic, w)) {
					System.out.println("단어장에 단어를 수정했습니다.");
				}else {
					System.out.println("단어장에 단어를 수정하지 못했습니다.");
				}
				System.out.println();
				break;
			case '3':
				System.out.println();
				System.out.println("삭제할 단어를 입력하세요.");
				w=searchWord(dic, w);
				System.out.println();
				if(deleteWord(dic, w)) {
					System.out.println("단어장에 단어를 삭제했습니다.");
				}else {
					System.out.println("단어장에 단어를 삭제하지 못했습니다.");
				}
				System.out.println();
				break;
			case '4':
				System.out.println();
				System.out.println("검색할 단어를 입력하세요.");
				w=inputSearchWord(sc);
				System.out.println();
				Word tmp= searchWord(dic, w);
				if(tmp!=null) {
					System.out.println(tmp);
				}else {
					System.out.println("단어장에 "+w.name+"가 없습니다.");
				}
				System.out.println();
				break;
			case '5':
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}while(menu!='5');
		
		sc.close();
	}
	
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 단어 검색");
		System.out.println("5. 종료");
		System.out.println();
		System.out.print("메뉴를 입력하세요 : ");
		
		
	}
	
//	기능 : 단어장(리스트)에 단어를 추가하는 메소드로 단어장에 추가하면 true 추가하지 못하면 false를 반환
//	매개변수 : 워드컬렉션 = List<Word>, 워드 = Word, 스캐너
//	리턴타입 : boolean
//	메소드명 : insertWord
	
	public static boolean insertWord(List<Word> dic, Word w) {
		if(dic==null || w==null || dic.contains(w)) {
			return false;
		}
		
		dic.add(w);
		
		return true;
		
	}
	
//	기능 : 단어, 품사, 뜻을 입력받아 단어를 만들어 반환하는 메소드
//	매개변수 : 없음 (스캐너는 메소드 내부에서 선언해도 됨)
//	리턴타입 : Word
//	메소드명 : inputAllWord
	
	public static Word inputAllWord(Scanner sc) {
		
		Word w=new Word();
		char menu='y';
		String tmp="";
		
		System.out.print("단어 : ");
		w.name=sc.next();
		
		do {
			
			System.out.print("품사 : ");

//			while(true) {
//				tmp=sc.nextLine();
//				if(tmp.trim().length()!=0) {
//					break;
//				}
//			}
			
			while((tmp=sc.nextLine()).trim().length()==0);
			
			w.wordClass.add(tmp);
			
			System.out.print("의미 : ");
			
			while((tmp=sc.nextLine()).trim().length()==0);
			
			w.meaning.add(tmp);
			
			System.out.print("품사와 의미를 더 입력하시겠습니까? (y/n) : ");
			
			menu=sc.next().charAt(0);
			
		}while(menu=='y' || menu=='Y');
		
		return w;
		
	}
	
//	기능 : 단어장에 단어를 검색해서 있으면 단어를 반환, 없으면 null 반환하는 메소드
//	매개변수 : List<Word> dic
//	리턴타입 : Word
//	메소드명 : searchWord
	
	public static Word searchWord(List<Word> dic, Word w) {
		if(dic==null || w==null) {
			return null;
		}
		
		
//		향상된 for문으로 dic에 있는 단어들을 하나씩 가져와서 tmp에 연결
		for(Word tmp:dic) {
//			단어장에서 꺼내온 단어 tmp와 검색 단어 w를 비교하여 같으면 단어장에서 꺼내온 단어를 반환
			if(tmp.equals(w)) {
				return tmp;
			}
		}
		
//		단어장에서 다 확인했는데 검색 단어 w가 없으면 null을 반환
		return null;
	}
	
//	기능 : 스캐너를 통해 검색어를 입력하여 검색어를 단어로 변환하여 변환하는 메소드
//	매개변수 : 스캐너 => Scanner
//	리턴타입 : 검색어로 만들어진 단어 => Word
//	메소드명 : inputSearchWord
	
	public static Word inputSearchWord(Scanner sc) {
		System.out.print("단어 : ");
		return new Word(sc.next(), null, null);
	}
	
//	기능 : 단어장에 단어를 검색해서 있으면 삭제하고 true를 반환, 없으면 false를 반환하는 메소드
//	매개변수 : List<Word> dic, Word w
//	리턴타입 :	boolean
//	메소드명 : deleteWord
	
	public static boolean deleteWord(List<Word> dic, Word w) {
		if(dic==null || w==null) {
			return false;
		}
		return dic.remove(w);
	}
	
	public static boolean modifyWord(List<Word> dic, Word w) {
		if(dic == null || w == null || !dic.contains(w)) {
			return false;
		}
		dic.remove(w);
		dic.add(w);
		return true;
	}

}

class Word {
	
	String name; // 단어
	List<String> meaning=new ArrayList<String>(); // 뜻
	List<String> wordClass=new ArrayList<String>(); // 품사
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Word other = (Word) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str="단어 : "+name+"\n";
		for(int i=0; i<meaning.size(); i++) {
			str+=(i+1)+". "+wordClass.get(i)+" "+meaning.get(i);
		}
		return str;
	}
	
	public Word() {
		
	}

	public Word(String name, List<String> meaning, List<String> wordClass) {
		super();
		this.name = name;
		this.meaning = meaning;
		this.wordClass = wordClass;
	}
		
}
