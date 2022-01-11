package ch03;

public class VIPCustomer2 extends Customer2{

	private String agentID;
	double salesRatio;

	// ==========================
	// 오류가 나는 이유
	// 기본으로 만들어지는 super()가 여기에선 먹히지 않는다
	// 상속받는 Customer2의 생성자가 변수를 받는 형태로 변형되었기에!
	// 오류를 해결하기 위해선 >> super(int값, string값);으로 직접 만들어주거나
	//						  >> public VIPCustomer2(int값, string값)으로 재설정 ㄱㄱ()
	// ==========================
	
	// 오류난다. 
	public VIPCustomer2() 
	{
		// 상속받은 상태에서, 부모 생성자 호출하는 super();가 기본으로 숨겨져있다고 이해하자
		
		// 2번 경우의 수 생성자 초기화

		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	// 오류안난다.
	public VIPCustomer2(int customerID, String customerName) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;	
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, string) 생성자 호출");
	}

	
	
	
	
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
		  
	
}
