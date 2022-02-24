package singleton.after;

public class Settings {

// ===============================================
// 1. 싱글톤
// 개념 : 특정 클래스의 객체가, 해당 프로세스에서 딱 하나만 만들어져 있어야 하는 경우 사용하는 디자인 패턴
// singleton을 사용한 후, 다크모드 설정 객체의 모습. 자세한 개발 방법은 아래 참고
// (한번 적용하면 모든 페이지에서 유지되는 모습)
//
// ===============================================	
	
  // 1) 먼저 생성자를 private로 만든다. 다른 클래스에서 new로 생성하지 못하도록!(Settings set = new Settings(); 금지)	
  private Settings () {};
  
  // 2) 컴파일시 메모리 공간을 하나만 쓰기 위해, 정적 변수 및 메소드를 생성한다.
  // 2-1) static으로 클래스 자기자신인 객체(변수)를 생성한다. 
  private static Settings settings = null;

  // 2-2) static으로 정적 메소드를 생성한다.
  public static Settings getSettings () {
	  
	// 맨 처음 호출하는 거라면(다른곳에서 호출x 상태라면) 변수를 선언하고,  
    if (settings == null) {
      settings = new Settings();
    }
    return settings; // 아니라면 그냥 변수 그대로 리턴		
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