package Chapter1.ch03;

public class CustomerTest2 {

	public static void main(String[] args) {
		
//		Customer customerPeak = new Customer();
//		customerPeak.setCustomerName("박하람");
//		customerPeak.setCustomerID(940511);
//		customerPeak.bonusPoint = 7000;
//		System.out.println(customerPeak.showCustomerInfo());
		
		VIPCustomer2 customerKim = new VIPCustomer2(890115, "김삿갓"); 
//		customerKim.setCustomerName("김삿갓");
//		customerKim.setCustomerID(890115);
		customerKim.bonusPoint = 50000;
		
		// VIPCustomer는 Customer의 상속을 받은 상태, 아래 호출 시 customer() 생성자가 먼저 호출된 후 VIPCustomer() 생성자가 호출
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
