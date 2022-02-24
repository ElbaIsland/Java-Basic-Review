package strategy.after;

// 인터페이스란? 일종의 '자격증'이라고 보면 된다.
// 자격증이 없이는 해당 일(search)를 하지 못하고, 반면 해당 자격이 있다면 일(search)를 반드시 해야한다!
interface SearchStrategy {
  public void search ();
}

class SearchStratagyAll implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH ALL");
      // 전체검색하는 코드
  }
}

class SearchStratagyImage implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH IMAGE");
      // 이미지검색하는 코드
  }
}

class SearchStratagyNews implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH NEWS");
      // 뉴스검색하는 코드
  }
}

class SearchStratagyMap implements SearchStrategy {
  public void search () {
      System.out.println("SEARCH MAP");
      // 지도검색하는 코드
  }
}