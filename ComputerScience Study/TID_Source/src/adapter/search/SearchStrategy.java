package adapter.search;

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

//...

class SearchFindAdapter implements SearchStrategy {
	
	private FindAlgorithm findAlgorithm; // ������ �߰��� FindAlgorithm ��ü�� �����ڷ� �־��ش�.
	
	public SearchFindAdapter (FindAlgorithm _findAlgorithm) {
	  findAlgorithm = _findAlgorithm;
	}
	public void search () {
	  findAlgorithm.find(true);	//	���� search ��ɾ�����, ��ģ�� �Ͽ��� findAlgorithm �޼ҵ带 ����!
	}
}