package Day7;

public class ClassEx3 {

	public static void main(String[] args) {
		//클래스 메서드 호출은 클래스명.클래스메서드명 또는 객체.클래스메서드명 둘 다 가능
		KIACar.PrintInfo();
		KIACar c1=new KIACar();
		//car1.PrintInfo(); // 가능은 하지만 권장하지 않음
		c1.printCarInfo();
		KIACar.PrintInfo();
		KIACar c2=new KIACar("뉴그랜버드",6);
		c2.printCarInfo();
		c2.power();
		for(int i=0; i<10; i++) {
			c2.Accel();
			c2.printSpeed();
		}
		c2.power();
		for(int i=0; i<20; i++) {
			c2.Brake();
			c2.printSpeed();
		}
		c2.power();
	}
	
}
// 모닝, k3, 쏘렌토
class KIACar {
	// 클래스 변수
	private static String manufacturer = "KIA";
	private static int salesNumber=0;
	
	// 객체 변수
	private int wheel;
	private boolean power;
	private int speed;
	private String carName;
		
	// 클래스 메소드
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	public static void PrintInfo() {
		System.out.println("제조사 : "+manufacturer);
		System.out.println("판매량 : "+salesNumber+"대");
	}
	// 객체 메소드
	public void power() {
		if(power==false) {
		System.out.println("시동이 켜졌습니다.");
		power=!power;
		}
		else if(power==true&&speed==0) {
			System.out.println("시동이 꺼졌습니다.");
			power=!power;
		}
		else {
			System.out.println("주행중에는 시동을 끌 수 없습니다.");
		}
	}
	public void Accel() {
		speed+=10;
	}
	public void Brake() {
		if(speed>0) {
			speed-=10;
		}
	}
	public void printSpeed() {
		System.out.println("현재 주행 속도는 "+speed+"Km/h입니다.");
	}
	public void printCarInfo() {
		System.out.println("차종 : "+carName);
		System.out.println("바퀴수 : "+wheel);
		printSpeed();
	}
	// 생성자
	public KIACar() {
		wheel=4;
		carName="미정";
		salesNumber++;
	}
	public KIACar(String carName, int wheel) {
		/* 멤버 변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
		 * 이러한 경우 멤버 변수를 의미하기 위해 변수명 앞에 this.멤버변수명으로 사용한다.
		 * this.은 자기자신을 의미하는 객체 */
		this.carName=carName;
		this.wheel=wheel;
		salesNumber++;
	}
		
}