package ch03;

public class VIPCustomer extends Customer{

//  Customer class���� ����� �ޱ� ������, �Ʒ��� ���� �ٽ� ������ �Է��� �ʿ䰡 ����.
//	private int customerID;	
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;

	// vip ������ ���� ���� ����
	private String agentID;
	double salesRatio;

	public VIPCustomer() 
	{
		// ��ӹ��� ���¿���, �θ� ������ ȣ���ϴ� super();�� �⺻���� �������ִٰ� ��������
		
		// 2�� ����� �� ������ �ʱ�ȭ
		customerGrade = "VIP";
		bonusRatio = 0.05;	
		salesRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
		  
	
}
