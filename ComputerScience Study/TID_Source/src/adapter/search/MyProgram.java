// ����Ͷ� : ������ �ٸ� �� ���̿� ����ż� ���� ȣȯ�ǵ��� �ϴ� ��
// ��ü���� ���α׷��ֿ��� ����ʹ�, �������̽��� ���� �ٸ� ��ü���� ���� ���� �ȿ��� �۵��ϵ��� �ϴ� ��
// => 1) ū ��Ĵ翡�� ��������� ������ ���������� ��Ƽ������ �����ؼ� ����ϱ� �����~
// => 2) ��Ƽ������ ����͸� �޾�, '�丮��' ����� ������ '������'�� �����ؼ� �۾��ϴ�..

// ex) ���� strategy ���� �ڵ带 �״�� ������, �ٸ�ȸ���� ������ �˻� ����� ������ ��

package adapter.search;

public class MyProgram {
	
  private SearchButton searchButton = new SearchButton(this);

  public void setModeAll () { 
    searchButton.setSearchStrategy(new SearchStratagyAll());
  }
  public void setModeImage () {
    searchButton.setSearchStrategy(new SearchStratagyImage());
  }
  public void setModeNews () {
    searchButton.setSearchStrategy(new SearchStratagyNews());
  }
  public void setModeMap () {
    searchButton.setSearchStrategy(new SearchStratagyMap());
  }
  
  
  //...(����Ϳ��� �߰��� ����!!)
  public void setModeMovie () {
	    searchButton.setSearchStrategy(
	      new SearchFindAdapter(new FindMovieAlgorithm())	//	����;ȿ� FindMovieAlgorithm �˰��� ��ü�� input
	    );
	  }  
	    
  public void testProgram () {
//    searchButton.onClick();   // "SEARCH ALL" ���
//    setModeImage();           // �̹����˻� ����
//    searchButton.onClick();   // "SEARCH IMAGE" ���
//    setModeNews();            // �����˻� ����
//    searchButton.onClick();   // "SEARCH NEWS" ���
//    setModeMap();             // �����˻� ����
    setModeMovie();
    searchButton.onClick();
  }


}