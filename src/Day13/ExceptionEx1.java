package Day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int[] arr=new int[4];
			// 예외가 발생되면 그 이후 코드는 실행되지 않고 catch로 건너뛴다.
			arr[3]=10;
			System.out.println("Hello World!");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ClassCastException e) {
			System.out.println("클래스 관련 예외 발생");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("배열 관련 예외 발생");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		
	}

}
