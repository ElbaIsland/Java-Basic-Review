package ch04;

public class Customer2 {

	// =============================
	// 21.07.26 �����ڿ� ���� ���� 2
	// =============================
	
	
	// �߿������� private ������
	// �̷�ģ������ ��������� �θ��ٴ°�
	private int customerID;	
	private String customerName;
	protected String customerGrade;	// VIPCustomer���� ��ӹ޾� ����ϴ� �����̱⿡, private => protected�� ����
	int bonusPoint;
	double bonusRatio;
	
	
	/* ������ ���� 1
	 * 1) default �����ڰ� �ƴ�, �Ʒ��� ���� �����ڿ��� �۵� ���
	 */
	public Customer2(int customerID, String customerName)
	{
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
	/*
	 * ���� ���Ž� ����Ʈ �ִ� �Լ�
	 * �Ʒ��� ���� ����Ǽ��� ���� ��, Ŭ������ ���ϼ��� ��ġ�� �ڵ�� BAD CODE!
	 * ���� �Ʒ��� ���� ���������� Ŭ������ '���' �Ǵ� Ŭ���� �и��� ���� Ŭ������ ���ϼ��� �����ֵ��� ����
	 * (VIPCUSTOMER Ŭ���� Ȯ���Ұ�~)
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
		return customerName + "���� ����� " + customerGrade + "�̸�, ����Ʈ�� " + bonusPoint + " point �Դϴ�.";
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
