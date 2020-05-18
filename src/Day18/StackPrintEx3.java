package Day18;

import java.util.*;

public class StackPrintEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.print("입력받을 정수의 갯수 : ");
		int size=sc.nextInt();
		
		Stack<Integer> stack=new Stack<Integer>();
		
		System.out.printf("정수 %d개를 입력하세요 : ", size);
		
		for(int i=0; i<size; i++) {
			stack.push(sc.nextInt());
		}
		
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		
		Stack<Integer> tmp=new Stack<Integer>();
		tmp.addAll(stack);
		
		for(int i=size; i>=1; i--) {
			System.out.print(tmp.pop()+" ");
		}
				
		sc.close();
	}
	
	public static void reversePrint(List<Integer> list) {
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}
}
