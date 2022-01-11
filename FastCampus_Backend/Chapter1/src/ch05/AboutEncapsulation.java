package ch05;

public class AboutEncapsulation {

/*	캡슐화 : 꼭 필요한 정보와 기능만 외부에 오픈함
 * 			 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현 하게 함
	ex ) StringBuffer buffer = new StringBuffer();
		 private String line = "===========================================\n";
		 private String title = "  이름\t   주소 \t\t  전화번호  \n";
		 private void makeHeader()
		 {
			buffer.append(line);
			buffer.append(title);
			buffer.append(line);
		 }
		private void generateBody()
		{
			buffer.append("James \t");
			buffer.append("Seoul Korea \t");
			buffer.append("010-2222-3333\n");
			
			buffer.append("Tomas \t");
			buffer.append("NewYork US \t");
			buffer.append("010-7777-0987\n");
		}
		private void makeFooter()
		{
			
			buffer.append(line);
		}
		
		public String getReport()
		{
			makeHeader();
			generateBody();
			makeFooter();
			return buffer.toString();
		}
		 
			
	이런식으로 buffer를 통해 string을 쭈욱 길게 연결하여 전송, 특정 정보에 대한 데이터만을 보낼 수 있다.(일종의 정보은닉)
*/
	
}
