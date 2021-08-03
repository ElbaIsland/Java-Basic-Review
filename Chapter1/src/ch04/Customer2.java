package ch04;

public class Customer2 {

	// =============================
	// 21.07.26 생성자에 대한 이해 2
	// =============================
	
	
	// 중요정보는 private 변수로
	// 이런친구들을 멤버변수로 부른다는것
	private int customerID;	
	private String customerName;
	protected String customerGrade;	// VIPCustomer에서 상속받아 사용하는 변수이기에, private => protected로 변경
	int bonusPoint;
	double bonusRatio;
	
	
	/* 생성자 변형 1
	 * 1) default 생성자가 아닌, 아래와 같은 생성자에서 작동 방식
	 */
	public Customer2(int customerID, String customerName)
	{
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
	/*
	 * 물건 구매시 포인트 주는 함수
	 * 아래와 같이 경우의수가 많이 들어간, 클래스의 단일성을 해치는 코드는 BAD CODE!
	 * 따라서 아래와 같이 복잡해지는 클래스는 '상속' 또는 클래스 분리를 통해 클래스의 단일성을 지켜주도록 하자
	 * (VIPCUSTOMER 클래스 확인할것~)
	 */
	/*
	 * public int calcPrice(int price) {
	 *  if (customerGrade == "SILVER")
	 *  { 
	 *  bonusPoint += price * bonusRatio;
	 *  return price; 
	 *  }
	 *   else if (customerGrade == "VIP") {
	 *  ~~code~~
	 *  }
	 *  else ~~~~code~~~~
	 * }
	 */
	
	public int calcPrice(int price) 
	{	
			bonusPoint += price * bonusRatio;
			return price;			
	}	
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 포인트는 " + bonusPoint + " point 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	 
	
	
	
	 

}
