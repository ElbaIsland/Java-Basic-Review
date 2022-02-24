package command.after;

import java.util.ArrayList;

//
public class RobotKit {
	
	  private Robot robot = new Robot();	//	1) �κ��� ��ü�� �⺻ ���������� �޴´�.
	  
	  // 2) Command�� ����� Ŭ����(�̵��ϰ� ����Ʋ�� ���)���� ��ü�� ���� list
	  private ArrayList<Command> commands = new ArrayList<Command>();
	
	  // 3) ��ɳֱ�
	  public void addCommand (Command command) {
	    commands.add(command);
	  }
	  
	  // 4) start�ϸ� �� ����� ���� ����!
	  public void start () {
	    for (Command command : commands) {
	      command.setRobot(robot);
	      command.execute();
	    }
	  }
	  
}