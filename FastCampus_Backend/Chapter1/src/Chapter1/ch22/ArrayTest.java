package Chapter1.ch22;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student(940511, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(940502, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 80);
		studentKim.addSubject("영어", 90);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}
}
