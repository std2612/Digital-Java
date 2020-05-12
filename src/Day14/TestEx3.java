package Day14;

public class TestEx3 {

	public static void main(String[] args) {
		/*	다음 조건을 만족하는 클래스를 생성하세요.
			1. 클래스 이름은 Point로 2차원 좌표평면의 점을 나타내는 클래스이다.
			2. 멤버변수는 x좌표와 y좌표가 있다.
			3. 두 점이 주어졌을 때 두 점이 같은지를 비교하는 equals() 메소드를 오버라이딩 해야한다.
			4. 좌표의 점을 확인하기 위한 toString() 메소드를 오버라이딩해서 확인한다.
			5. 생성자를 이용하여 멤버변수를 초기화 한다.
			6. 두점의 거리를 계산하는 distance() 메소드를 구현해야 한다.
		 	-공식 : 루트((x2-x1)의 제곱+(y2-y1)의 제곱)
		 
		 	클래스를 생성한후 main()메소드에서 테스트하세요. */
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(4, 5);
		System.out.println(p1.equals(p2));
		System.out.println(p3);
		System.out.println(p1.distance(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
	}

}
class Point {
	private int x, y;

	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// obj와 this가 같은 객체를 공유하고 있는 경우
		if (this == obj)
			return true;
		// 비교할 점 obj가 없는 경우
		if (obj == null)
			return false;
		// 비교할 obj가 Point 클래스가 아닌 경우
		if (getClass() != obj.getClass())
			return false;
		// obj가 Point 클래스의 객체인 경우
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double distance(Point other) {
		return Math.sqrt(Math.pow(other.x-x, 2.0)+Math.pow(other.y-y, 2.0));
	}
	
}
