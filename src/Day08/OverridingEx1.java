package Day08;

import static java.lang.System.out;

public class OverridingEx1 {
	
	public static void main(String[] args) {
		Duck d=new Duck();
		d.cry();
		Sparrow s=new Sparrow();
		s.cry();
		s.cry(1);
		Sparrow s2=new Sparrow(1);
		out.println(s.getWing());
		out.println(s2.getWing());
		

	}

}

class Bird{
	protected int wing;
	public void cry() {
		System.out.println("새가 웁니다.");
	}
	public Bird() {
		wing=2;
	}
	public Bird(int wing) {
		this.wing=wing;
	}
	protected int getWing() {
		return wing;
	}
	protected void setWing(int wing) {
		this.wing = wing;
	}
	
}
class Duck extends Bird{
	// 메소드 오버라이딩
	@Override
	public void cry() {
		// 메서드 오버라이딩을 하는데 작업하는 메서드명과 같은 부모 클래스의 메서드를 super없이 호출하면 부모 클래스의 메서드가 아닌
		// 내 클래스의 메서드로 호출되어 재귀호출이 된다. 부모클래스의 메서드를 의미하기 위해 super를 붙인다.
		super.cry();
		System.out.println("오리 : 꽥꽥");
	}
//	public Duck() {	// 생성자가 하나도 없으면 기본 생성자가 자동으로  생성된다
//		super();
//	}
}
class Sparrow extends Bird{
	// 메소드 오버로딩
	public void cry(int num) {
		super.cry();	//
		System.out.println("참새 : 짹짹");
	}

	public Sparrow() {
		super(); // 부모클래스 기본 생성자
	}

	public Sparrow(int wing) {
		super(wing); // 부모클래스 생성자 오버로딩
	}
	
}