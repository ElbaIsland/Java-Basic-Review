package singleton.after;

public class MyProgram {
	
  public static void main (String[] args) {
	  
	// firstpage에서 적용된 객체가 그대로 second에도~
    new FirstPage().setAndPrintSettings();
    new SecondPage().printSettings();
    
  }
  
}