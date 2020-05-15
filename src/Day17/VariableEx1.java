package Day17;

public class VariableEx1 {
	static int num1; // 클래스 변수, 일반 변수
	static A a1; // 클래스 변수, 참조 변수
	int num2; // 객체 변수, 일반 변수
	A a2; // 객체 변수, 참조 변수
		
	@SuppressWarnings("unused")
	public static void main(String[] args/* 매개 변수, 참조 변수 */) {
		int num3; // 지역 변수, 일반 변수	
		A a3; // 지역 변수, 참조 변수
	}
	
	public static void test(int num1/* 매개 변수, 일반 변수 */, A a1/* 매개 변수, 참조 변수*/) {
		
	}
}
class A {
	int num; // 객체 변수, 일반 변수
}
/* 객체 멤버 변수 : 	static이 없는 멤버 변수
 * 				객체들이 공유하지 않음 클래스
 * 
 * 클래스 멤버 변수 :	static이 있는 멤버 변수
 * 				객체들이 공유하는 변수
 * 
 * 지역 변수 : 		메서드 안에서 선언되는 변수들 (매개 변수 포함)
 * 
 * 매개 변수 : 		메서드 선언부에서 ()안에 들어가는 변수들
 * 				메서드를 실행하는데 있어 필요한 정보
 * 				매개 변수는 항상 지역 변수이다 (메서드 안에서만 사용 가능하기 때문)
 * 
 * 일반 변수 : 		자료형이 int와 같은 기본 자료형인 변수들
 * 
 * 참조 변수 : 		일반 변수가 아닌 변수로 클래스의 객체나 배열등이 있음
 * 				주소를 저장함
 * */
