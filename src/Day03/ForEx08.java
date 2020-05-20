package Day03;

public class ForEx08 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i+=1) {
			System.out.println("Hi");
			if(i==3) {
				break;
			}
		}
		for(int i=1; i<=10; i+=1) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
