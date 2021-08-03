package ch03;

public class VIPCustomer2 extends Customer2{

	private String agentID;
	double salesRatio;

	// ==========================
	// ������ ���� ����
	// �⺻���� ��������� super()�� ���⿡�� ������ �ʴ´�
	// ��ӹ޴� Customer2�� �����ڰ� ������ �޴� ���·� �����Ǿ��⿡!
	// ������ �ذ��ϱ� ���ؼ� >> super(int��, string��);���� ���� ������ְų�
	//						  >> public VIPCustomer2(int��, string��)���� �缳�� ����()
	// ==========================
	
	// ��������. 
	public VIPCustomer2() 
	{
		// ��ӹ��� ���¿���, �θ� ������ ȣ���ϴ� super();�� �⺻���� �������ִٰ� ��������
		
		// 2�� ����� �� ������ �ʱ�ȭ

		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	// �����ȳ���.
	public VIPCustomer2(int customerID, String customerName) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;	
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, string) ������ ȣ��");
	}

	
	
	
	
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
		  
	
}
