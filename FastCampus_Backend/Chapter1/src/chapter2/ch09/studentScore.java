package chapter2.ch09;

public class studentScore {

	int studentId;
	String studentName;
	
	// ���� �Ǿ��� ��, ���� ���� �����ȵ� ����
	Subject korea;
	Subject math;
	
	studentScore(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		// �����ڸ� ���� ���� ����
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
		
		System.out.println(studentName + "���� ������ " + total + "�� �Դϴ�.");
	}
	
}
