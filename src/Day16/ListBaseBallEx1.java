package Day16;

import java.util.*;

public class ListBaseBallEx1 {

	public static void main(String[] args) {
		int size=3;
		int s=0, b=0;
		
		ArrayList<Integer> com=new ArrayList<Integer>(size);
		ArrayList<Integer> user=new ArrayList<Integer>(size);
		Scanner sc=new Scanner(System.in);
		
		createComList(com, size);
		
		System.out.println(com);
				
		while(s!=3) {
			
			createUserList(user, sc, size);
			
			s=strike(com, user, size);
			
			if(s!=0) {
				System.out.print(s+"S");
			}
			
			b=ball(com, user, size);
			
			if(b!=0) {
				System.out.print(b+"B");
			}
			
			if(s==0 && b==0) {
				System.out.print("3O");
			}
			
			System.out.println();
			user.clear();
			
		}
		
		System.out.println("종료");
		sc.close();
	}
	
	public static void createComList(ArrayList<Integer> com, int size) {
		while(size>com.size()) {
			Integer r=new Random().nextInt(9)+1;
			if(!com.contains(r)) {
				com.add(r);
			}
		}
	}
	
	public static void createUserList(ArrayList<Integer> user, Scanner sc, int size) {
		while(user.size()<size) {
			Integer i=sc.nextInt();
			user.add(user.size(), i);
		}
	}
	
	public static int strike(ArrayList<Integer> com, ArrayList<Integer> user, int size) {
		int cnt=0;
		for(int i=0; i<size; i++) {
			if(com.get(i)==user.get(i)) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static int ball(ArrayList<Integer> com, ArrayList<Integer> user, int size) {
		int cnt=0;
		for(int j=0; j<size; j++) {
			if(com.contains(user.get(j))) {
				cnt++;
			}
		}
		return cnt-strike(com, user, size);
	}

}
