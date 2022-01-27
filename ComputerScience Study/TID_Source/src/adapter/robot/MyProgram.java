package adapter.robot;

// ���� �κ� ��ɿ�, �ٸ� ȸ�翡�� ���� �޸��� ����� �߰�!!


public class MyProgram { 	
	
  public static void main(String[] args) {
    RobotKit robotKit = new RobotKit();

    robotKit.addCommand(new MoveForwardCommand(2));
    robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
    robotKit.addCommand(new MoveForwardCommand(1));
    robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
    robotKit.addCommand(new PickupCommand());

    robotKit.addCommand(
		new CommandOrderAdapter(
				new MoveBackOrder(1)
		)
    );
    
    robotKit.start();

    // 2 ĭ ����
    // �������� ������ȯ
    // 1 ĭ ����
    // ���������� ������ȯ
    // ���� ���� ������
  }
  
  

}