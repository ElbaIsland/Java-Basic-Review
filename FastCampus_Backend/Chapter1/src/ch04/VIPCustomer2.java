package ch04;

public class VIPCustomer2 extends Customer2{

	private String agentID;
	double salesRatio;

	// ==========================
	// 07.28. 오버라이딩
	// 앞에서 적용하지 않았던, vip고객의 할인율 적용을 오버라이딩을 통해 적용한다.
	// ==========================
	
	// 오류안난다.
	public VIPCustomer2(int customerID, String customerName) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;	
		salesRatio = 0.1;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

	
	@Override	//	어노테이션 >> 컴파일러에게 이 메소드의 특성을 알려주는 역할(오버라이딩 등)
	public int calcPrice(int price) {
		// vip 포인트, 할인율 적용!
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price; 
	}
	
	
		  
}