package ch04;

public class VIPCustomer2 extends Customer2{

	private String agentID;
	double salesRatio;

	// ==========================
	// 07.28. �������̵�
	// �տ��� �������� �ʾҴ�, vip���� ������ ������ �������̵��� ���� �����Ѵ�.
	// ==========================
	
	// �����ȳ���.
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

	
	@Override	//	������̼� >> �����Ϸ����� �� �޼ҵ��� Ư���� �˷��ִ� ����(�������̵� ��)
	public int calcPrice(int price) {
		// vip ����Ʈ, ������ ����!
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price; 
	}
	
	
		  
}