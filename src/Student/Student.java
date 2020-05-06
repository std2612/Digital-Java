package Student;

public class Student {
	static int count=0;
	private int grade;
	private int classNum;
	private int num;
	private String name="";
	private Subject kor, eng, math;
	
	// getter, setter 설정
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 기능 설정
	public boolean equal(int grade, int classNum, int num, String name) {
		if(this.grade!=grade) return false;
		if(this.classNum!=classNum) return false;
		if(this.num!=num) return false;
		if(!this.name.equals(name)) return false;
		else return true;
	}
	Student(int grade, int classNum, int num, String name){
		this.grade=grade;
		this.classNum=classNum;
		this.num=num;
		this.name=name;
	}
	
}
