package Day53;

public class Ex7 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<11; i++) {
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
	}

}
