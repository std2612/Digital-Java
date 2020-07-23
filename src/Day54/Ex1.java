package Day54;

public class Ex1 {

	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point(1, 2);
		p1.print();
		System.out.println(p1.distance(3, 4));
		p2.print();
	}

}

class Point {
	private int x, y;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		x = p.x;
		y= p.y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println(x+", "+y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.x - x, 2.0) + Math.pow(this.y - y, 2.0));
	}
}
