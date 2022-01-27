package adapter.search;

// 1) 
// 다른회사에서 짠 동영상 검색 기능이라고 가정
// => 기존 SearchStrategy와 다른 형식...이것을 합치는 방법!

// 2) 
// SearchStrategy에서 SearchStrategy 인터페이스..
interface FindAlgorithm {
	public void find (boolean global);	//	메소드명도, 형식도 다르다
}
// 3)
// ===> 따라서, 기존 SearchButton 클래스에서 searchStrategy 생성자로 적용이 안된다.
// 그럼 어떻게 하오?? SearchStrategy 클래스에 추가된 어댑터를 확인!

class FindMovieAlgorithm implements FindAlgorithm {
	
  public void find (boolean global) {
      System.out.println(
        "find movie" + (global ? " globally" : "")
      );
      // 동영상검색하는 코드
      // ...
      // ...
  }
}