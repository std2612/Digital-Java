package Day5;

import Day4.*;	// '*'는 모든이라는 의미
import Day5_1.*;

public/*접근제한자*/ class ClassEx1/*클래스명*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEx3.main(null);
		DefaultClassEx1.main(null);
		/* DefaultClassEx2는 다른 패키지에 있는 클래스인데 접근제한자가 dafault이기 때문에
		 * 사용할 수 없기 때문에 에러 발생*/
		//DefaultClassEx2.main(null);
		Point p1=new Point();
		p1.x1=10;
		// Point클래스의 x2는 접근제한자가 Private이기 때문에 다른 클래스에서 사용할 수 없다.
		//p1.x2=10;
	}
}
// point : 2차원 좌표 평면에서 점 1개를 나타내는 클래스
class Point{
	int x1; // x축의 좌표
	int y1; // y축의 좌표
	private int x2;
	private int y2;
	public int x3;
	public int y3;
}