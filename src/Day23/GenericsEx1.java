package Day23;

public class GenericsEx1 {
//	p.670 지네릭스 : 클래스(A)의 안의 멤버 변수의 클래스(B)를 미리 지정해 놓지 않고, 클래스(A)를 생성할 때 결정하주는 클래스
	public static void main(String[] args) {
		Student<Double> s = new Student<Double>();
		s.kor = (double)10;
		System.out.println(s.kor);
		
	}

}

class Student<A> {
	String name;
	A kor;
	A eng;
	A math;
	
}