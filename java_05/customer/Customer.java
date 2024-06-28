package java_05.customer;

public class Customer {

	// customerId	- 고객 아이디
	// customerName	- 고객 이름
	// customerGrade	- 고객 등급
	// customerPoint	- 고객 보너스 포인트(제품 구매 시 누적)
	// customerRatio	- 보너스 포인트 적립 비율(구매 시, 일정 비율 포인트 적립)

	protected String customerId;
	protected String customerName;
	protected String customerGrade;
	int customerPoint;
	double customerRatio;

	public Customer() {
		customerGrade = "SILVER";
		customerRatio = 0.01;
	}
	
	public int calcRatio(int price) {
		customerPoint += price * customerRatio;
//		customerPoint = customerPoint + ( price * customerRatio );
		
		return customerPoint;		
	}

	public String customerInfo() {
		String result = "";

		result += "[ 고객 아이디 ] : "+ customerId + "\n";
		result += "[ 고객 이름 ] : "+ customerName + "\n";
		result += "[ 고객 등급 ] : "+ customerGrade + "\n";
		result += "[ 보너스 포인트 ] : "+ customerPoint + "\n";
		result += "[ 적립 비율 ] : "+ customerRatio + "\n";

		return result;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public int getCustomerPoint() {
		return customerPoint;
	}

	public void setCustomerPoint(int customerPoint) {
		this.customerPoint = customerPoint;
	}

	public double getCustomerRatio() {
		return customerRatio;
	}

	public void setCustomerRatio(double customerRatio) {
		this.customerRatio = customerRatio;
	}



}
