package Day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		
	}

}
interface RemoCon{ // 인터페이스
	
	/*pulbic final*/int num=10;
	public /*abstract*/ int chUp(int ch); // 추상메서드
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
	/* 인터페이스에 새로운 추상 메서드를 추가하면 해당 인터페이스를 구현한 모든 클래스에
	 * 에러가 발생한다. (오버라이딩을 하지 않아서)
	 * 이러한 번거로움을 해결하고자 디폴트 메서드를 이용한다.
	 * 디폴트 메서드는 추상 메서드와 같이 구현된 내용이 없지만 오버라이딩으로 구현하지 않아도 에러가 발생하지 않는다. */
	public default void test() {}
	
}
class TvRemoCon implements RemoCon{

	@Override
	public int chUp(int ch) {
		return ++ch;
	}

	@Override
	public int chDown(int ch) {
		return --ch;
	}

	@Override
	public int volUp(int vol) {
		return ++vol;
	}

	@Override
	public int volDown(int vol) {
		return --vol;
	}
	
}
