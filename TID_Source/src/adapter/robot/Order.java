package adapter.robot;

// 기존의 Command 클래스와는 전혀 호환되지 않는 Order 클래스
// 이를 어댑터를 통해서 연결한다!
interface Order {
  public void run (Robot robot);
}

class MoveBackOrder implements Order {
  private int block;

  public MoveBackOrder(int _block) {
    block = _block;
  }

  // run시 왼쪽으로 방향전환 두번 후 한칸 전진하는 형태
  public void run (Robot robot) {
    robot.turn(Robot.Direction.LEFT);
    robot.turn(Robot.Direction.LEFT);
    robot.moveForward(block);
  }
}