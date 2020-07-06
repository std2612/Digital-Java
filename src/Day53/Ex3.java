package Day53;

public class Ex3 {

	public static void main(String[] args) {
		int num=9;
		for(int i=1; true; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
			if(i>=num) {
				break;
			}
		}
	}

}
