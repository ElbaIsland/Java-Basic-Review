package singleton.before;

public class Settings {

	// ===============================================
	// 1. 싱글톤
	// singleton을 사용하기 전, 일반적인 (다크모드 설정) 객체의 모습.
	// 어느 클래스에서든 자유롭게 호출할 수 있으며, 각각에서 객체가 따로 만들어지기에 한번에 관리가 안된다.
	// (페이지별로 다크모드가 각각 적용되는 모습)
	//
	// ===============================================

	public boolean darkmode = false;
	private int fontsize = 13;
	
	public boolean isDarkmode() {
		return darkmode;
	}
	public void setDarkmode(boolean darkmode) {
		this.darkmode = darkmode;
	}
	public int getFontsize() {
		return fontsize;
	}
	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}

}
