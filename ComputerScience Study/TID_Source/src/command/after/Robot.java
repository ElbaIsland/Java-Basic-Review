package command.after;

public class Robot {
  public enum Direction { LEFT, RIGHT }

  public void moveForward (int space) {
    System.out.println(space + " ĭ ����");
  }

  public void turn (Direction _direction) {
    System.out.println(
      (_direction == Direction.LEFT ? "����" : "������") + "���� ������ȯ"
    );
  }

  public void pickup () {
    System.out.println("���� ���� ������");
  }
}