package singleton.after;

public class SecondPage {
	
	// 생성자를 사용하지 않고도 바로 호출이 가능하다. 
	private Settings settings = Settings.getSettings();

	public void printSettings () {
	    System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}
}