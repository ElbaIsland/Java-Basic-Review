package chapter2.ch09;

public class RefDataType {

	
	public static void main(String[] args) {
		
		studentScore peakScore = new studentScore(100, "peakHaram");
		
		peakScore.setKorSub("국어", 100);
		peakScore.setMathSub("수학", 100);
		
		studentScore trashScore = new studentScore(30, "trashMan");
		
		trashScore.setKorSub("국어", 50);
		trashScore.setMathSub("수학", 50);
		
		peakScore.showScore();
		trashScore.showScore();
		
	}
	
	
	
	
}
