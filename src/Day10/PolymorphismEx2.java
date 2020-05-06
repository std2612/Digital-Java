package Day10;

public class PolymorphismEx2 {

	public static void main(String[] args) {
//		/* 제조사의 종류와 상관없이 10개짜리 배열에 차량을 관리할 수 있다. */
//		Car arr[]=new Car[10]; // 입고된 차량을 관리하기 위한 배열
//		arr[0]=new KIACar();
//		arr[1]=new HYUNDAICar();
//		
//		/* 제조사가 추가되면 해당 제조사를 관리하기 위한 배열을 추가로 만들어서 관리햐야한다. */
//		KIACar Karr[]=new KIACar[10];
//		HYUNDAICar Harr[]=new HYUNDAICar[10];
//		Karr[0]=new KIACar();
//		Harr[0]=new HYUNDAICar();
		Car arr[]=new Car[10];
		arr[0]=new KIACar("모닝");
		arr[1]=new KIACar("K3");
		arr[2]=new KIACar("쏘울");
		arr[3]=new HYUNDAICar("아반떼");
		arr[4]=new HYUNDAICar("쏘나타");
		arr[5]=new HYUNDAICar("그랜저");
		showCar(arr);
	}
	public static void showCar(Car arr[]) {
		System.out.println("--입고된 차량 리스트--");
		for(Car tmp:arr) {
			if(tmp!=null) {
				if(tmp instanceof KIACar) {
					System.out.println(tmp.manufacturer+" "+tmp.name+" "+((KIACar)tmp.KIA);
				}
				if(tmp instanceof HYUNDAICar) {
					System.out.println(tmp.manufacturer+" "+tmp.name+" "+((HYUNDAICar)tmp.HYUNDAI);
				}
			}
		}
	}

}
class Car{
	int wheel;
	String type;
	String manufacturer;
	String name;
	public Car() {}
	public Car(String manufacturer, String name) {
		this.manufacturer=manufacturer;
		this.name=name;
	}
}
class KIACar extends Car{
	public KIACar() {
		manufacturer="KIA";
	}
	public KIACar(String name) {
		super("KIA",name);
	}
}
class HYUNDAICar extends Car{
	public HYUNDAICar() {
		manufacturer="HYUNDAI";
	}
	public HYUNDAICar(String name) {
		super("HYUNDAI",name);
	}
}
