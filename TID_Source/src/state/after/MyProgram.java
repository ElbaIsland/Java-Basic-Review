package state.after;

public class MyProgram {
  public static void main(final String[] args) {
    final ModeSwitch modeSwitch = new ModeSwitch();

    modeSwitch.onSwitch(); // "FROM LIGHT TO DARK" ���
    modeSwitch.onSwitch(); // "FROM DARK TO LIGHT" ���
//    modeSwitch.onSwitch(); // "FROM LIGHT TO DARK" ���
//    modeSwitch.onSwitch(); // "FROM DARK TO LIGHT" ���
  }
}