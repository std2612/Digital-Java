package Day18;

import java.util.*;

public class TestEx3 {

	public static void main(String[] args) {
		
		
	}
	
}

class Word {
	String word;
	List<String> wordClass=new ArrayList<String>();
	List<String> meaning=new ArrayList<String>();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
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
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}

class Dic {
	List<Word> list=new ArrayList<Word>();
//	단어 추가
//	단어 수정 => 품사 수정하거나 뜻을 수정
//	단어 삭제
//	단어 출력 => 한 단어의 정보를 출력하거나 특정 단어가 들어간 단어를 출력
}