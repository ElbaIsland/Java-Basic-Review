package adapter.search;

// 1) 
// �ٸ�ȸ�翡�� § ������ �˻� ����̶�� ����
// => ���� SearchStrategy�� �ٸ� ����...�̰��� ��ġ�� ���!

// 2) 
// SearchStrategy���� SearchStrategy �������̽�..
interface FindAlgorithm {
	public void find (boolean global);	//	�޼ҵ��, ���ĵ� �ٸ���
}
// 3)
// ===> ����, ���� SearchButton Ŭ�������� searchStrategy �����ڷ� ������ �ȵȴ�.
// �׷� ��� �Ͽ�?? SearchStrategy Ŭ������ �߰��� ����͸� Ȯ��!

class FindMovieAlgorithm implements FindAlgorithm {
	
  public void find (boolean global) {
      System.out.println(
        "find movie" + (global ? " globally" : "")
      );
      // ������˻��ϴ� �ڵ�
      // ...
      // ...
  }
}