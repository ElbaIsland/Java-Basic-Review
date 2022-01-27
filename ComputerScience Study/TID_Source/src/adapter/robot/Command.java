package adapter.robot;

// 추상 클래스
// 스스로는 객체를 생성해서 활동하지 못하지만, 
// 상속을 받은 자식 클래스들이 변수와 메소드를 그대로 사용하거나 자유롭게 수정해서 사용 가능하다. 
abstract class Command {
	
	  protected Robot robot;	//	1) 로봇 객체
	
	  public void setRobot (Robot _robot) {	//	2) 로봇의 값을 세팅(지정)하는 메소드
		  this.robot = _robot;
	  }
	  public abstract void execute ();	//	3) 로봇에게 명령하여 실행시키는 추상 메소드 => 구현도 자식클래스에서!
}

class MoveForwardCommand extends Command {
	
	int space;
	
	public MoveForwardCommand (int _space) { // 1) space를 인자로 받아서
		space = _space; 
	}
	
	public void execute () {
	    robot.moveForward(space);	//	moveForward 실행
	}
}

class TurnCommand extends Command {
	  Robot.Direction direction;
	  
	  public TurnCommand (Robot.Direction _direction) {
	    direction = _direction;
	  }
	  
	  public void execute () {
	    robot.turn(direction);
	  }
}

class PickupCommand extends Command {
	
	  // 특별한 인자받거나 셋하거나 하는거 없이 바로 pickup!
	  public void execute () {
	    robot.pickup();
	  }
	  
}

// 기존의 Command 
// 추가한 달리기 기능을 어댑터로 연결
class CommandOrderAdapter extends Command {
	  private Order order;

	  public CommandOrderAdapter (Order _order) {
	    order = _order;
	  }

	  public void execute () {
	    order.run(robot);
	  }
	}