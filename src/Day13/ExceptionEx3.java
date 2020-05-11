package Day13;

public class ExceptionEx3 {

	public static void main(String[] args) {
//		System.out.println(cal(1, '/', 0)); // 예외가 발생하여 프로그램이 강제 종료
		try {
			System.out.println(cal(1, '/', 0));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/* cal 메서드는 예외처리를 하지 않고 예외를 발생만 시킨다.
	 * 예외처리는 main 메서드에서 할 것이다. */
	public static double cal(int num1, char op, int num2) {
		double res=0.0;
		switch(op) {
		case'+':	res=num1+num2;	break;
		case'-':	res=num1-num2;	break;
		case'*':	res=num1*num2;	break;
		case'/':	
		if(num2==0)	{
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		res=(double)num1/num2;	break;
		case'%':	
		if(num2==0)	{
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		res=num1%num2;	break;
		default: 	throw new ArithmeticException(op+"는 산술연산자가 아닙니다.");
		}
		return res;
	}

}
