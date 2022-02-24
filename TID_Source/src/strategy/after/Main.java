package strategy.after;

public class Main {
	
	// ===============================================
	// 2. 전략(strategy)
	// 개념 : 프로세스의 각 기능별로 모듈을 분리하는 디자인 패턴
	// 객체가 할 수 있는 행위 각각을 분리된 모듈(전략)로 분리하여 개발한다.
	// (한번 적용하면 모든 페이지에서 유지되는 모습)
	//
	// ===============================================		
	
	
  public static void main(String[] args) {
    MyProgram myProgram = new MyProgram();
    myProgram.testProgram();
  }
}