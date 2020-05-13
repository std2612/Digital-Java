package Day15;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		//로또 예제를 Set을 이용해 작성하시오.
		HashSet<Integer> com=new HashSet<Integer>();
		HashSet<Integer> user=new HashSet<Integer>();
		
		Scanner sc=new Scanner(System.in);
		int size=3;
		int min=1, max=9;
		while(com.size()<size) {
			int random=new Random().nextInt(max-min+1)+min;
			System.out.print(random+" ");
			com.add(random);
		}
		System.out.println();
		while(user.size()<size) {
			user.add(sc.nextInt());
		}
		Iterator<Integer> it1=com.iterator();
		Iterator<Integer> it2=user.iterator();
		int i=1;
		while(it1.hasNext() && it2.hasNext()) {
			Integer num1=it1.next();
			Integer num2=it2.next();
			if(num1.equals(num2)) {
				System.out.println(i+"번째로 가져온 두 값 "+num1+"은 같습니다.");
			}else {
				System.out.println(i+"번째로 가져온 두 값 "+num1+"과 "+num2+"은 다릅니다.");
			}
		}
	}
	
	
	
}
