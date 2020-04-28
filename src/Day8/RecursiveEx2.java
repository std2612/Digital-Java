package Day8;

public class RecursiveEx2 {

	public static void main(String[] args) {
		// for문을 이용한 팩토리얼
		System.out.println(facto(5));
	}
	public static int facto(int n) {
		int res=1;
		if(n==1||n==0)
			return 1;
		if(n<0)
			return 0;
		for(int i=1; i<=n; i++) {
			res*=i;
		}
		return res;
	}
}
