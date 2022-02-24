// 어댑터란 : 형식이 다른 둘 사이에 연결돼서 서로 호환되도록 하는 것
// 객체지향 프로그래밍에서 어댑터는, 인터페이스가 서로 다른 객체들이 같은 형식 안에서 작동하도록 하는 것
// => 1) 큰 양식당에서 양식조리사 셰프랑 제과조리사 파티쉐한테 구분해서 명령하기 힘들어~
// => 2) 파티쉐에게 어댑터를 달아, '요리해' 명령을 가지고 '제과해'로 이해해서 작업하는..

// ex) 기존 strategy 패턴 코드를 그대로 가져와, 다른회사의 동영상 검색 기능을 연결할 것

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
  
  
  //...(어댑터에서 추가된 영역!!)
  public void setModeMovie () {
	    searchButton.setSearchStrategy(
	      new SearchFindAdapter(new FindMovieAlgorithm())	//	어댑터안에 FindMovieAlgorithm 알고리즘 객체를 input
	    );
	  }  
	    
  public void testProgram () {
//    searchButton.onClick();   // "SEARCH ALL" 출력
//    setModeImage();           // 이미지검색 모드로
//    searchButton.onClick();   // "SEARCH IMAGE" 출력
//    setModeNews();            // 뉴스검색 모드로
//    searchButton.onClick();   // "SEARCH NEWS" 출력
//    setModeMap();             // 지도검색 모드로
    setModeMovie();
    searchButton.onClick();
  }


}