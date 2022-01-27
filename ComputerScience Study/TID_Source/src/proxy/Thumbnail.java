package proxy;

interface Thumbnail {
  public void showTitle ();
  public void showPreview ();
}

class RealThumbnail implements Thumbnail {
  private String title;
  private String movieUrl;

  public RealThumbnail (String _title, String _movieUrl) {
    title = _title;
    movieUrl = _movieUrl;

    // URL�κ��� ������ �ٿ�޴� �۾� - �ð� �Ҹ� 
    System.out.println(movieUrl + "�κ��� " + title + "�� ���� ������ �ٿ�");
  }
  public void showTitle () {
    System.out.println("����:" + title);
  }
  public void showPreview () {
    System.out.println(title + "�� ������ ���");
  }
}

class ProxyThumbnail implements Thumbnail {
  private String title;
  private String movieUrl;

  private RealThumbnail realThumbnail;

  public ProxyThumbnail (String _title, String _movieUrl) {
    title = _title;
    movieUrl = _movieUrl;
  }

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