package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerPeak = new Customer();
//		customerPeak.setCustomerName("���϶�");
//		customerPeak.setCustomerID(940511);
//		customerPeak.bonusPoint = 7000;
//		System.out.println(customerPeak.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(); 
		customerKim.setCustomerName("���");
		customerKim.setCustomerID(890115);
		customerKim.bonusPoint = 50000;
		
		// VIPCustomer�� Customer�� ����� ���� ����, �Ʒ� ȣ�� �� customer() �����ڰ� ���� ȣ��� �� VIPCustomer() �����ڰ� ȣ��
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
