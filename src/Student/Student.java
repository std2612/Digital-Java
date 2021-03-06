package Student;

public class Student {
	//멤버 변수 설정
	String name="";
	int grade;
	int classNum;
	int num;
	Subject score[];
	
	//기능 설정
	public boolean equal(int grade, int classNum, int num, String name) {
		if(this.grade!=grade)	return false;
		if(this.classNum!=classNum) return false;
		if(this.num!=num) return false;
		if(!this.name.equals(name))	return false;
		return true;
	}
	public boolean equal2(Student s) {
		if(this.grade!=s.grade)	return false;
		if(this.classNum!=s.classNum) return false;
		if(this.num!=s.num) return false;
		return true;
	}
	
	//getter, setter 설정
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public void setScore(Subject...score) {
		this.score = new Subject[score.length];
		for(int i = 0 ; i<score.length; i++) {
			//this.score[i] = score[i];
			this.score[i] = new Subject(score[i]);
		}
	}
	public void printScore() {
		for(Subject tmp : score) {
			tmp.print();
		}
	}

	public void printStdinfo() {
		System.out.println("학생의 이름 : "+name);
		System.out.println("학생의 학년 : "+grade);
		System.out.println("학생의 반 : "+classNum);
		System.out.println("학생의 번호 : "+num);
	}
	public Subject[] getScore() {
		return score;
	}
	public void addScore(Subject[] addScore) {
		int aSize=0, bSize=0;
		if(score!=null) {
			aSize=score.length;
		}
		if(addScore!=null) {
			bSize=addScore.length;
		}
		Subject[] tmp=new Subject[aSize+bSize];
		for(int i=0; i<aSize; i++) {
			tmp[i]=score[i];
		}
		for(int i=0; i<bSize; i++) {
			tmp[aSize+i]=addScore[i];
		}
		score=tmp;
	}
	
}