package chapter1.ch04;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		Customer2 customerPeak = new Customer2(940511, "박하람");
		customerPeak.bonusPoint = 10000;
		int price = customerPeak.calcPrice(10000);	// 일반 customer에서 호출했기에, 기존 calcPrice
		System.out.println(customerPeak.showCustomerInfo() + ", price : " + price);
		
		
		
		VIPCustomer2 customerKim = new VIPCustomer2(890115, "김삿갓"); 
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(10000);	// vip에서 호출했기에, 재정의한 calcPrice
		
		
		
		// 포인트, 구매가가 서로 다른것을 확인할 수 있다.
		System.out.println(customerKim.showCustomerInfo() + ", price : " + price);
		
		
		// 아래의 경우의 수는?
		// 아래 testAgain. 누른채로 자동완성 화면을 보면, 일반 customer만 보인다. VIPCustomer2지만, customer2로 대입이 되어있기에
		// (자세히 이해가 안가면 이전강의 03-03의 뒷부분 참조)
		// 이러한 경우를 '가상 메소드'라고 하며, 자세한 내용은 3-5를 참조하자.  
		Customer2 testAgain = new VIPCustomer2(12345, "testname");
	//	testAgain.calcPrice(10000);
		System.out.println(testAgain.calcPrice(10000));
		
	} 
}
