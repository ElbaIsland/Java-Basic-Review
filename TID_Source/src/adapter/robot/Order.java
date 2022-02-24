package adapter.robot;

// ������ Command Ŭ�����ʹ� ���� ȣȯ���� �ʴ� Order Ŭ����
// �̸� ����͸� ���ؼ� �����Ѵ�!
interface Order {
  public void run (Robot robot);
}

class MoveBackOrder implements Order {
  private int block;

  public MoveBackOrder(int _block) {
    block = _block;
  }

  // run�� �������� ������ȯ �ι� �� ��ĭ �����ϴ� ����
  public void run (Robot robot) {
    robot.turn(Robot.Direction.LEFT);
    robot.turn(Robot.Direction.LEFT);
    robot.moveForward(block);
  }
}