package chapter1.ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerPeak = new Customer();
		customerPeak.setCustomerName("박하람");
		customerPeak.setCustomerID(940511);
		customerPeak.bonusPoint = 7000;
		System.out.println(customerPeak.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(); 
		customerKim.setCustomerName("김삿갓");
		customerKim.setCustomerID(890115);
		customerKim.bonusPoint = 50000;
		// 상속을 받은 상태기에 Customer 클래스의 메소드 실행~ 
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
