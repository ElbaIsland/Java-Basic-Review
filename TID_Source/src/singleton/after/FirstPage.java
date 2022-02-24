package singleton.after;
	
public class FirstPage {
	
	// 생성자를 사용하지 않고도 바로 호출이 가능하다. 
	private Settings settings = Settings.getSettings();

	public void setAndPrintSettings () {
		settings.setDarkMode(true);
		settings.setFontSize(15);
		System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}
}