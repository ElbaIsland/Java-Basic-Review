package strategy.after;

// �������̽���? ������ '�ڰ���'�̶�� ���� �ȴ�.
// �ڰ����� ���̴� �ش� ��(search)�� ���� ���ϰ�, �ݸ� �ش� �ڰ��� �ִٸ� ��(search)�� �ݵ�� �ؾ��Ѵ�!
interface SearchStrategy {
  public void search ();
}

class SearchStratagyAll implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH ALL");
      // ��ü�˻��ϴ� �ڵ�
  }
}

class SearchStratagyImage implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH IMAGE");
      // �̹����˻��ϴ� �ڵ�
  }
}

class SearchStratagyNews implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH NEWS");
      // �����˻��ϴ� �ڵ�
  }
}

class SearchStratagyMap implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH MAP");
      // �����˻��ϴ� �ڵ�
  }
}