package chapter2.ch09;

public class RefDataType {

	
	public static void main(String[] args) {
		
		studentScore peakScore = new studentScore(100, "peakHaram");
		
		peakScore.setKorSub("����", 100);
		peakScore.setMathSub("����", 100);
		
		studentScore trashScore = new studentScore(30, "trashMan");
		
		trashScore.setKorSub("����", 50);
		trashScore.setMathSub("����", 50);
		
		peakScore.showScore();
		trashScore.showScore();
		
	}
	
	
	
	
}
