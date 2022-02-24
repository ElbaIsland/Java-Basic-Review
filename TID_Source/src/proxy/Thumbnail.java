package proxy;

// 1) ����� �������̽� �ȿ� ���񺸿��ֱ� / ������ ��� �޼ҵ� �α�
interface Thumbnail {
  public void showTitle ();
  public void showPreview ();
}

// ��ü Ŭ����
class RealThumbnail implements Thumbnail {
  private String title;
  private String movieUrl;

  	
	  public RealThumbnail (String _title, String _movieUrl) {
	    title = _title;
	    movieUrl = _movieUrl;
	
	    // URL�κ��� ������ �ٿ�޴� �۾� - �ð� �Ҹ� : �����ɸ��� ���ſ� �۾� 
	    System.out.println(movieUrl + "�κ��� " + title + "�� ���� ������ �ٿ�");
	  }
	  
	  public void showTitle () {
	    System.out.println("����:" + title);
	  }
	  
	  public void showPreview () {
	    System.out.println(title + "�� ������ ���");
	  }
}

//���Ͻ� Ŭ����
class ProxyThumbnail implements Thumbnail {
	private String title;
	private String movieUrl;
	
	private RealThumbnail realThumbnail;
	
	// 1) ���� RealThumbnail�� �޸� ���� �޾ƿ��� x
	public ProxyThumbnail (String _title, String _movieUrl) {
		title = _title;
		movieUrl = _movieUrl;
	}
	
	// 2) showTitle�� ���� ������ �۾��� ����, showPreview�� ���� ���ſ� �۾��� ��ü Ŭ���� ������!
	public void showTitle () {
		System.out.println("����:" + title);
	}
	 
	public void showPreview () {
		if (realThumbnail == null) {
			realThumbnail = new RealThumbnail(title, movieUrl);
		}
		realThumbnail.showPreview();
	}
}