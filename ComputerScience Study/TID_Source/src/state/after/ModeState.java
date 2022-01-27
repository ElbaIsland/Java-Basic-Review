package state.after;

// ModeState interface �ȿ� �������ִ� �޼ҵ��
public interface ModeState {
	public void toggle (ModeSwitch modeSwitch);	//	����ġ ON & OFF
}

// ���� �������̽��� implement => ������ �� �� �ְ� �Ǿ���!!
class ModeStateLight implements ModeState {
	
	public void toggle (ModeSwitch modeSwitch) 
	{
	    System.out.println("FROM LIGHT TO DARK");
	    // ȭ���� ��Ӱ� �ϴ� �ڵ�
	    // ..
	    // ..
	    modeSwitch.setState(new ModeStateDark());	// Dark State�� ����
	}
}

class ModeStateDark implements ModeState {
	public void toggle (ModeSwitch modeSwitch) 
	{
	    System.out.println("FROM DARK TO LIGHT");
	    // ȭ���� ��� �ϴ� �ڵ�
	    // ..
	    // ..
	    modeSwitch.setState(new ModeStateLight());	// Light State�� ����
	}
}