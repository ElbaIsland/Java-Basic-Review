package command.after;

import java.util.ArrayList;

//
public class RobotKit {
	
	  private Robot robot = new Robot();	//	1) 로봇의 객체를 기본 변수값으로 받는다.
	  
	  // 2) Command를 상속한 클래스(이동하고 방향틀고 잡고)들의 객체를 담을 list
	  private ArrayList<Command> commands = new ArrayList<Command>();
	
	  // 3) 명령넣기
	  public void addCommand (Command command) {
	    commands.add(command);
	  }
	  
	  // 4) start하면 들어간 명령을 각각 실행!
	  public void start () {
	    for (Command command : commands) {
	      command.setRobot(robot);
	      command.execute();
	    }
	  }
	  
}