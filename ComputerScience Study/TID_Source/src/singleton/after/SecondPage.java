package singleton.after;

public class SecondPage {
	
	// �����ڸ� ������� �ʰ� �ٷ� ȣ���� �����ϴ�. 
	private Settings settings = Settings.getSettings();

	public void printSettings () {
	    System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}
}