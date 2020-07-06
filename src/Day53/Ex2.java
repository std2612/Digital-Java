package Day53;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score=sc.nextInt();
		
		if(score<=100 && score>=95) {
			System.out.print("학점은 A+입니다.");
		}else if(score<=94 && score>=90) {
			System.out.print("학점은 A입니다.");
		}else if(score<=89 && score>=85) {
			System.out.print("학점은 B+입니다.");
		}else if(score<=84 && score>=80) {
			System.out.print("학점은 B입니다.");
		}else if(score<=79 && score>=75) {
			System.out.print("학점은 C+입니다.");
		}else if(score<=74 && score>=70) {
			System.out.print("학점은 C입니다.");
		}else if(score<=69 && score>=65) {
			System.out.print("학점은 D+입니다.");
		}else if(score<=64 && score>=60) {
			System.out.print("학점은 D입니다.");
		}else if(score<=59 && score>=0) {
			System.out.print("학점은 F입니다.");
		}else {
			System.out.print("잘못된 점수입니다.");
		}
		
		sc.close();
	}

}
