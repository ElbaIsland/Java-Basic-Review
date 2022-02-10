package chapter1.ch02;

public class VIPCustomer extends Customer{

//  Customer class에서 상속을 받기 때문에, 아래와 같이 다시 변수를 입력할 필요가 없다.
//	private int customerID;	
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;

	// vip 고객들을 위한 전용 변수
	private String agentID;
	double salesRatio;

	public VIPCustomer() 
	{
		// 2번 경우의 수 생성자 초기화
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
		  
	
}
