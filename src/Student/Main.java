package Student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s=new Student();
		s.setScore(new Subject("국어",40,40,10,10),
				new Subject("영어",40,40,10,10),
				new Subject("수학",40,40,10,10));
		s.printScore();
		}
	
	}

