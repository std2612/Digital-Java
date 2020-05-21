package Day20;

import java.util.*;
import java.util.Map.Entry;

public class DicEx1 {

	public static void main(String[] args) {
		List<Word> dic=new ArrayList<Word>();
		Scanner sc=new Scanner(System.in);
		char menu=0;
		
		while(menu!='5') {
			printMenu();
			menu=sc.next().charAt(0);
			
			switch(menu) {
			case '1':
				if(insertWord(inputWord(sc), dic)) {
					System.out.println("단어가 등록되었습니다.");
					System.out.println();
					break;
				}
				
				System.out.println("중복되는 단어가 있습니다.");
				System.out.println();
				break;
				
			case '2':
				System.out.println();
				if(modifyWord(tmpWord(sc), dic, sc)) {
					System.out.println("단어가 수정되었습니다.");
					System.out.println();
					break;
				}
				
				System.out.println("단어 수정 메뉴가 종료되었습니다.");
				System.out.println();
				break;
				
			case '3':
				if(deleteWord(tmpWord(sc), dic)) {
					System.out.println("단어가 삭제되었습니다.");
					System.out.println();
					break;
				}
				
				System.out.println("일치하는 단어가 없습니다.");
				System.out.println();
				break;
				
			case '4':
				if(printWord(tmpWord(sc), dic)) {
					System.out.println();
					break;
				}
				System.out.println("일치하는 단어가 없습니다.");
				System.out.println();
				break;
				
			case '5':
				System.out.println("종료합니다.");
				break;
				
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				System.out.println();
			}
		}
		
		
	}
	
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 단어 검색");
		System.out.println("5. 종료");
		System.out.print("메뉴를 입력하세요 : ");
	}
	
	public static Word inputWord(Scanner sc) {
		Word w=new Word();
		Map<String, String> mc= new HashMap<String, String>();
		
		System.out.print("단어를 입력하세요 : ");
		w.setName(sc.next());
		System.out.print("품사를 입력하세요 : ");
		String wc=sc.next();
		System.out.print("의미를 입력하세요 : ");
		String m=sc.next();
		mc.put(m, wc);
		w.setMeaningClass(mc);
		
		return w;
	}
	
	public static boolean insertWord(Word w, List<Word> dic) {
		if(w==null || dic==null) {
			return false;
		}
		
		if(dic.contains(w)) {
			return false;
		}
		
		dic.add(w);
		return true;
	}
	
	public static boolean modifyWord(Word w, List<Word> dic, Scanner sc) {
		if(!dic.contains(w)) {
			System.out.println("없는 단어입니다.");
			return false;
		}
		
		System.out.println();
		
		char menu=0;
		
		while(menu!='3') {
			System.out.println("단어 수정 메뉴");
			System.out.println("1. 품사와 의미 추가");
			System.out.println("2. 품사와 의미 삭제");
			System.out.println("3. 이전 메뉴로");
			System.out.print("메뉴를 입력하세요 : ");
			
			menu=sc.next().charAt(0);
				
			switch(menu) {
			case '1':
				System.out.print("추가할 품사를 입력하세요 : ");
				String tmpwc=sc.next();
				
				System.out.print("추가할 의미를 입력하세요 : ");
				String tmpm=sc.next();
				
				int wIndex=dic.indexOf(w);
				Word deleteWord=dic.get(wIndex);
				HashMap<String, String> mc=(HashMap<String, String>)deleteWord.meaningClass;
								
				if(mc.containsKey(tmpm)) {
					System.out.println("이미 있는 의미입니다.");
					return false;
				}
				
				mc.put(tmpm, tmpwc);
				System.out.println("품사와 의미가 추가되었습니다.");
				System.out.println();
				break;
				
				
			case '2':
				System.out.print("삭제할 의미를 정확하게 입력해주세요 : ");
				String tmpm2=sc.next();
				
				int wIndex2=dic.indexOf(w);
				Word deleteWord2=dic.get(wIndex2);
				HashMap<String, String> mc2=(HashMap<String, String>)deleteWord2.meaningClass;
				
				if(!mc2.containsKey(tmpm2)) {
					System.out.println("없는 의미입니다");
					return false;
				}
				
				mc2.remove(tmpm2);
				System.out.println("의미가 삭제 되었습니다.");
				System.out.println();
				break;
				
			case '3':
				break;
				
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}
		}
		return true;
		
	}
	
	public static boolean deleteWord(Word w, List<Word> dic) {
		if(w==null || dic==null) {
			return false;
		}
		
		if(!dic.remove(w)) {
			return false;
		}
		
		return true;
	}
	
	public static Word tmpWord(Scanner sc) {
		System.out.print("단어를 입력하세요 : ");
		return new Word(sc.next(), null);
	}
	
	public static boolean printWord(Word w, List<Word> dic) {
		if(w==null || dic==null) {
			return false;
		}
		
		if(!dic.contains(w)) {
			return false;
		}
		
		for(Word tmp:dic) {
			if(tmp.equals(w)) {
				System.out.println("단어 : "+tmp.name);
				
				Set<Map.Entry<String, String>> mcSet=tmp.meaningClass.entrySet();
				Iterator<Entry<String, String>> mcIt=mcSet.iterator();
				
				while(mcIt.hasNext()) {
					Map.Entry<String, String> e=(Map.Entry<String, String>)mcIt.next();
					System.out.printf("품사 : %s, 의미 : %s", e.getValue(), e.getKey());
					System.out.println();
				}
			}
		}
		return true;
	}

}

class Word {
	
	String name;
	Map<String, String> meaningClass= new HashMap<String, String>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getMeaningClass() {
		return meaningClass;
	}

	public void setMeaningClass(Map<String, String> meaningClass) {
		this.meaningClass = meaningClass;
	}

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
	
	public Word() {
		
	}

	public Word(String name, Map<String, String> meaningClass) {
		super();
		this.name = name;
		this.meaningClass = meaningClass;
	}

	@Override
	public String toString() {
		return name+", "+meaningClass;
	}
	
	
	
	
	
}