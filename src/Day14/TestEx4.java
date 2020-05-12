package Day14;

public class TestEx4 {

	public static void main(String[] args) {
		print1("ㅋ", 10);
		System.out.println(print2('ㅋ', 10));
		print3('ㅋ', 10);
		
	}
	public static void print1(String str, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	public static String print2(char ch, int cnt) {
		StringBuffer res = new StringBuffer(cnt);
		for(int i=0; i<cnt; i++) {
			res.append(ch);
		}
		return res.toString();
	}
	public static void print3(char ch, int cnt) {
		StringBuffer res = new StringBuffer(cnt);
		for(int i=0; i<cnt; i++) {
			res.append(ch);
		}
		System.out.println(res.toString());
	}
	
}

