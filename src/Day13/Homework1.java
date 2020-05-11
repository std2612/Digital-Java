package Day13;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		int min=0, max=0; 
		Scanner sc=new Scanner(System.in); 
		System.out.print("랜덤수의 최소값을 입력하세요 : "); 
		min=sc.nextInt(); 
		System.out.print("랜덤수의 최대값을 입력하세요 : "); 
		max=sc.nextInt(); 
		if(min>max) { 
			int tmp=min; 
			min=max; 
			max=tmp; 
		} 
		int random=(int)(Math.random()*(max-min+1)+min);
		System.out.println(random);
		int tmp=-1;
		while(tmp!=random) {
			System.out.print("예상한 랜덤수를 입력하세요 : ");
			tmp=sc.nextInt();
			if(tmp==random) {
				break;
			}
			if(tmp<random) {
				System.out.println("Up");
			}
			if(tmp>random) {
				System.out.println("Down");
			}
			
		}
		System.out.println("랜덤수 = "+tmp+" 정답입니다.");
		sc.close();
	}

}
