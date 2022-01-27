package proxy;

// 1) 썸네일 인터페이스 안에 제목보여주기 / 프리뷰 재생 메소드 두기
interface Thumbnail {
  public void showTitle ();
  public void showPreview ();
}

// 실체 클래스
class RealThumbnail implements Thumbnail {
  private String title;
  private String movieUrl;

  	
	  public RealThumbnail (String _title, String _movieUrl) {
	    title = _title;
	    movieUrl = _movieUrl;
	
	    // URL로부터 영상을 다운받는 작업 - 시간 소모 : 오래걸리는 무거운 작업 
	    System.out.println(movieUrl + "로부터 " + title + "의 영상 데이터 다운");
	  }
	  
	  public void showTitle () {
	    System.out.println("제목:" + title);
	  }
	  
	  public void showPreview () {
	    System.out.println(title + "의 프리뷰 재생");
	  }
}

//프록시 클래스
class ProxyThumbnail implements Thumbnail {
	private String title;
	private String movieUrl;
	
	private RealThumbnail realThumbnail;
	
	// 1) 위의 RealThumbnail과 달리 영상 받아오기 x
	public ProxyThumbnail (String _title, String _movieUrl) {
		title = _title;
		movieUrl = _movieUrl;
	}
	
	// 2) showTitle과 같은 가벼운 작업은 직접, showPreview와 같은 무거운 작업은 실체 클래스 가지고!
	public void showTitle () {
		System.out.println("제목:" + title);
	}
	 
	public void showPreview () {
		if (realThumbnail == null) {
			realThumbnail = new RealThumbnail(title, movieUrl);
		}
		realThumbnail.showPreview();
	}
}