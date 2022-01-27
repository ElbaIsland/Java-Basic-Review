package state.after;

public class ModeSwitch {
	
	// strategy 패턴의 SearchButton 클래스와 유사한 것을 확인할 수 있다.
	
  private ModeState modeState = new ModeStateLight();

  public void setState (ModeState _modeState) {
    modeState = _modeState;
  }

  // SearchButton의 onswitch
  public void onSwitch () {
	  System.out.println("onswitch in >> " + this.modeState);
	  modeState.toggle(this);
  }
}