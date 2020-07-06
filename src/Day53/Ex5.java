package Day53;

public class Ex5 {

	public static void main(String[] args) {
		int num=9;
		int i=1;
		while(true) {
			System.out.printf("%d x %d = %d%n", num, i, num*i++);
			if(i>num) {
				break;
			}
		}
	}

}
