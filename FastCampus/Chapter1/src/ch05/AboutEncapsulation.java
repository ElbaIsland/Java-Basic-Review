package ch05;

public class AboutEncapsulation {

/*	ĸ��ȭ : �� �ʿ��� ������ ��ɸ� �ܺο� ������
 * 			 ��κ��� ��� ������ �޼��带 ���߰� �ܺο� ���յ� �������̽����� �����Ͽ� �ϰ��� ����� ���� �ϰ� ��
	ex ) StringBuffer buffer = new StringBuffer();
		 private String line = "===========================================\n";
		 private String title = "  �̸�\t   �ּ� \t\t  ��ȭ��ȣ  \n";
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
		 
			
	�̷������� buffer�� ���� string�� �޿� ��� �����Ͽ� ����, Ư�� ������ ���� �����͸��� ���� �� �ִ�.(������ ��������)
*/
	
}
