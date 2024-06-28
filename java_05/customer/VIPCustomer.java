package java_05.customer;

public class VIPCustomer extends Customer {
	
	// VIP 고객 전용 혜택 관리
	
	// agentId		- 전문 상담사
	// saleRatio	- 제품 구매 할인율 10%
	
	// customerRatio	- 0.05 (5%) - 기본 Customer 1%
	
	private String agentId;
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		customerRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public String customerInfo() {
		String result = "";
		
		result += "[ 고객 아이디 ] : "+ customerId + "\n";
		result += "[ 고객 이름 ] : "+ customerName + "\n";
		result += "[ 고객 등급 ] : "+ customerGrade + "\n";
		result += "[ 보너스 포인트 ] : "+ customerPoint + "\n";
		result += "[ 적립 비율 ] : "+ customerRatio + "\n";
		result += "[ 제품 구매 할인율 ] : "+ saleRatio + "\n";
		
		return result;
	}
	
	public String getAgentId() {
		return agentId;
	}
	
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	

}
