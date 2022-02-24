package singleton.after;
	
public class FirstPage {
	
	// �����ڸ� ������� �ʰ� �ٷ� ȣ���� �����ϴ�. 
	private Settings settings = Settings.getSettings();

	public void setAndPrintSettings () {
		settings.setDarkMode(true);
		settings.setFontSize(15);
		System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}
}