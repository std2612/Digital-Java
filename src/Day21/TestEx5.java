package Day21;

public class TestEx5 {
	// - 9개짜리 배열을 만들어서 2단의 결과를 배열에 저장하는 코드를 작성하세요
	public static void main(String[] args) {
		int[] arr= new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1)*2;
		}
		
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		
	}

}
