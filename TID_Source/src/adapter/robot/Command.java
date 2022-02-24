package adapter.robot;

// �߻� Ŭ����
// �����δ� ��ü�� �����ؼ� Ȱ������ ��������, 
// ����� ���� �ڽ� Ŭ�������� ������ �޼ҵ带 �״�� ����ϰų� �����Ӱ� �����ؼ� ��� �����ϴ�. 
abstract class Command {
	
	  protected Robot robot;	//	1) �κ� ��ü
	
	  public void setRobot (Robot _robot) {	//	2) �κ��� ���� ����(����)�ϴ� �޼ҵ�
		  this.robot = _robot;
	  }
	  public abstract void execute ();	//	3) �κ����� ����Ͽ� �����Ű�� �߻� �޼ҵ� => ������ �ڽ�Ŭ��������!
}

class MoveForwardCommand extends Command {
	
	int space;
	
	public MoveForwardCommand (int _space) { // 1) space�� ���ڷ� �޾Ƽ�
		space = _space; 
	}
	
	public void execute () {
	    robot.moveForward(space);	//	moveForward ����
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
	
	  // Ư���� ���ڹްų� ���ϰų� �ϴ°� ���� �ٷ� pickup!
	  public void execute () {
	    robot.pickup();
	  }
	  
}

// ������ Command 
// �߰��� �޸��� ����� ����ͷ� ����
class CommandOrderAdapter extends Command {
	  private Order order;

	  public CommandOrderAdapter (Order _order) {
	    order = _order;
	  }

	  public void execute () {
	    order.run(robot);
	  }
	}