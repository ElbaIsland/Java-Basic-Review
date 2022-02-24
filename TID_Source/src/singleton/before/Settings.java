package singleton.before;

public class Settings {

	// ===============================================
	// 1. �̱���
	// singleton�� ����ϱ� ��, �Ϲ����� (��ũ��� ����) ��ü�� ���.
	// ��� Ŭ���������� �����Ӱ� ȣ���� �� ������, �������� ��ü�� ���� ��������⿡ �ѹ��� ������ �ȵȴ�.
	// (���������� ��ũ��尡 ���� ����Ǵ� ���)
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
