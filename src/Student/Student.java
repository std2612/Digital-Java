package Student;

public class Student {
	static int count=0;
	private int grade;
	private int classNum;
	private int num;
	private String name="";
	private Subject score[]; // 서브젝트 클래스
	
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
	Student(){
		count++;
	}
	Student(int grade, int classNum, int num, String name){
		this.grade=grade;
		this.classNum=classNum;
		this.num=num;
		this.name=name;
		count++;
	}
	public void setScore(Subject...score) {
		this.score=new Subject[score.length];
		for(int i=0; i<score.length; i++) {
			//this.score[i]=score[i];
			this.score[i]=new Subject(score[i]);
			
		}
	}
	
	public void printScore() {
		for(Subject tmp:score) {
			tmp.print();
		}
	}
	public void printStudent() {
		System.out.println("학생 이름 : "+name);
		System.out.println("학년  : "+grade);
		System.out.println("반  : "+classNum);
		System.out.println("번호 : "+num);
	}
}

