package Day14;

public class TestEx4 {

	public static void main(String[] args) {
		print.printMethod1("ㅋ", 10);
		printMethod1("ㅋ", 10);
	}
	public static void printMethod1(String str, int num) {
		for(int i=0; i<num; i++) {
			System.out.printf(str);
		}
	}
	
}
class print {
	public static void printMethod1(String str, int num) {
		for(int i=0; i<num; i++) {
			System.out.printf(str);
		}
	}
}
