package Chapter1.ch22;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	
	public void showStudentInfo() {
		
		int total = 0;	
		for (Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "님의" + subject.getSubjectName() + "과목 점수는 " + subject.getScore() + "점 입니다.");
		}
		 
		System.out.println(studentName + "님의 총점은 " + total + "점 입니다.");
	
	}
	
	
}

