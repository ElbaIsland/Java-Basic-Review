package chapter1.ch04;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		Customer2 customerPeak = new Customer2(940511, "���϶�");
		customerPeak.bonusPoint = 10000;
		int price = customerPeak.calcPrice(10000);	// �Ϲ� customer���� ȣ���߱⿡, ���� calcPrice
		System.out.println(customerPeak.showCustomerInfo() + ", price : " + price);
		
		
		
		VIPCustomer2 customerKim = new VIPCustomer2(890115, "���"); 
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(10000);	// vip���� ȣ���߱⿡, �������� calcPrice
		
		
		
		// ����Ʈ, ���Ű��� ���� �ٸ����� Ȯ���� �� �ִ�.
		System.out.println(customerKim.showCustomerInfo() + ", price : " + price);
		
		
		// �Ʒ��� ����� ����?
		// �Ʒ� testAgain. ����ä�� �ڵ��ϼ� ȭ���� ����, �Ϲ� customer�� ���δ�. VIPCustomer2����, customer2�� ������ �Ǿ��ֱ⿡
		// (�ڼ��� ���ذ� �Ȱ��� �������� 03-03�� �޺κ� ����)
		// �̷��� ��츦 '���� �޼ҵ�'��� �ϸ�, �ڼ��� ������ 3-5�� ��������.  
		Customer2 testAgain = new VIPCustomer2(12345, "testname");
	//	testAgain.calcPrice(10000);
		System.out.println(testAgain.calcPrice(10000));
		
	} 
}
