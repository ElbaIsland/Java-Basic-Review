package state.after;

// ModeState interface 안에 가지고있는 메소드들
public interface ModeState {
	public void toggle (ModeSwitch modeSwitch);	//	스위치 ON & OFF
}

// 위의 인터페이스를 implement => 가져다 쓸 수 있게 되었다!!
class ModeStateLight implements ModeState {
	
	public void toggle (ModeSwitch modeSwitch) 
	{
	    System.out.println("FROM LIGHT TO DARK");
	    // 화면을 어둡게 하는 코드
	    // ..
	    // ..
	    modeSwitch.setState(new ModeStateDark());	// Dark State로 변경
	}
}

class ModeStateDark implements ModeState {
	public void toggle (ModeSwitch modeSwitch) 
	{
	    System.out.println("FROM DARK TO LIGHT");
	    // 화면을 밝게 하는 코드
	    // ..
	    // ..
	    modeSwitch.setState(new ModeStateLight());	// Light State로 변경
	}
}