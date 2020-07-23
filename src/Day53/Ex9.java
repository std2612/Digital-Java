package Day53;

public class Ex9 {

	public static void main(String[] args) {
		System.out.println(sum(1, 10));
		System.out.println(sum(6, 10));
	}
	public static int sum(int min, int max) {
		int res=0;
		for(int i=min; i<=max; i++) {
			res+=i;
		}
		return res;
	}
}
