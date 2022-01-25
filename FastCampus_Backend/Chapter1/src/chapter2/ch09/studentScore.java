package chapter2.ch09;

public class studentScore {

	int studentId;
	String studentName;
	
	// 선언만 되었을 뿐, 아직 값이 지정안된 상태
	Subject korea;
	Subject math;
	
	studentScore(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		// 생성자를 통해 변수 생성
		korea = new Subject();
		math = new Subject();
	}

	public void setKorSub(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSub(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}	
	
	public void showScore() {		
		int total = korea.score + math.score;	
		
		System.out.println(studentName + "님의 총점은 " + total + "점 입니다.");
	}
	
}
