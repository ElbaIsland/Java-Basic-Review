package state.after;

public class ModeSwitch {
	
	// strategy ������ SearchButton Ŭ������ ������ ���� Ȯ���� �� �ִ�.
	
  private ModeState modeState = new ModeStateLight();

  public void setState (ModeState _modeState) {
    modeState = _modeState;
  }

  // SearchButton�� onswitch
  public void onSwitch () {
	  System.out.println("onswitch in >> " + this.modeState);
	  modeState.toggle(this);
  }
}