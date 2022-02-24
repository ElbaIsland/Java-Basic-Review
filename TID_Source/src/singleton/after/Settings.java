package singleton.after;

public class Settings {

// ===============================================
// 1. �̱���
// ���� : Ư�� Ŭ������ ��ü��, �ش� ���μ������� �� �ϳ��� ������� �־�� �ϴ� ��� ����ϴ� ������ ����
// singleton�� ����� ��, ��ũ��� ���� ��ü�� ���. �ڼ��� ���� ����� �Ʒ� ����
// (�ѹ� �����ϸ� ��� ���������� �����Ǵ� ���)
//
// ===============================================	
	
  // 1) ���� �����ڸ� private�� �����. �ٸ� Ŭ�������� new�� �������� ���ϵ���!(Settings set = new Settings(); ����)	
  private Settings () {};
  
  // 2) �����Ͻ� �޸� ������ �ϳ��� ���� ����, ���� ���� �� �޼ҵ带 �����Ѵ�.
  // 2-1) static���� Ŭ���� �ڱ��ڽ��� ��ü(����)�� �����Ѵ�. 
  private static Settings settings = null;

  // 2-2) static���� ���� �޼ҵ带 �����Ѵ�.
  public static Settings getSettings () {
	  
	// �� ó�� ȣ���ϴ� �Ŷ��(�ٸ������� ȣ��x ���¶��) ������ �����ϰ�,  
    if (settings == null) {
      settings = new Settings();
    }
    return settings; // �ƴ϶�� �׳� ���� �״�� ����		
  }

  private boolean darkMode = false;
  private int fontSize = 13;

  public boolean getDarkMode () { return darkMode; }
  public int getFontSize () { return fontSize; }

  public void setDarkMode (boolean _darkMode) { 
    darkMode = _darkMode; }
  public void setFontSize (int _fontSize) { 
    fontSize = _fontSize; }
}