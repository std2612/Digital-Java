package Day2;

public class ForEx2 {

	public static void main(String[] args) {
		// 구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		int i, num = 7;
		for(i=num; i<=63; i+=num) {
			System.out.println(num + " x " + i/num + " = " + i);
		}
		for(i=1; i<=9; i+=1) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		for(i=1; i<=9; i+=1) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
		
	}

}
