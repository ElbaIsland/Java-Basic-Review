package Chapter1.ch22;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student(940511, "Lee");
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student studentKim = new Student(940502, "Kim");
		
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 80);
		studentKim.addSubject("����", 90);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}
}
