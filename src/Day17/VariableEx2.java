package Day17;

import java.util.*;

public class VariableEx2 {
//	객체 멤버 변수 :			대부분의 사용자 클래스의 멤버 변수는 객체 멤버 변수이다
//	클래스 멤버 변수 :		동일한 클래스의 모든 객체들이 공유하는 정보가 있다면 클래스 멤버 변수로 한다
//	멤버 변수(클레스, 객체) :	의미있는 정보를 클래스 안에 선언할 때 사용하는 변수
//						해당 정보가 메소드 곳곳에서 사용할 때
//	지역 변수 :				메소드를 실행하는데 있어서 자체적으로 사용하는 변수
//						외부에서 알려주는 정보와 상관 없음
//	매개 변수 :				메소드를 실행하는데 있어서 외부에서 필요해서 가져온 변수
//						메소드 안에서
//						
	public static void main(String[] args) {
		Corona c1=new Corona();
		List<Corona> list=new ArrayList<Corona>();
		list.add(c1);
		Corona c2=new Corona();
		list.add(c2);
		
	}

}

class ClassRoom {
	int cnt=0; // 강의장의 학생 수
	int maxCnt=20; // 정원
	int i=0; // 메소드에서 반복문을 이용할 때 사용할 변수 => 멤버변수로 만드는 것은 부적절
	String classNum="401호";
	List<String> courseNameList=new ArrayList<String>();
	
	
}

class Corona {
	
}
