package Day54;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		Point p = new Point();
		
		List<Point> route = new ArrayList<Point>(4);
		
		route.add(new Point(p));
		p.move(0, 1);
		route.add(new Point(p));
		p.move(1, 1);
		route.add(new Point(p));
		p.move(2, 1);
		route.add(new Point(p));
		
		Iterator<Point> it = route.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
		
		System.out.println(route);
	}

}
