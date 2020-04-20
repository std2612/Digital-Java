package Day2;

public class IfEx1 {

	public static void main(String[] args) {
		// if문 예제1
		int num = 3;
		if(num % 2 == 0){
			System.out.println(num+"은(는) 짝수");
		}
		if(num % 2 == 1){ //else if(num % 2 != 0){
			System.out.println(num+"은(는) 홀수");
		}
		//if else문 예제
		if(num % 2 == 0) {
			System.out.println(num+"은(는) 짝수");
		}
		else{ //현재 위치를 기준으로 위에 있는 모든 조건식이 거짓이면 실행 (else는 조건식이 없다)
			System.out.println(num+"은(는) 홀수");
		}
		//if else if문 예제
		if(num % 2 == 0) {
			System.out.println(num+"은(는) 짝수");
		}
		else if(num % 2 == 1){
			System.out.println(num+"은(는) 홀수");
		}
	}
}

