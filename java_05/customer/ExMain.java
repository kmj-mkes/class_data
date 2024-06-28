package java_05.customer;

public class ExMain {

	public static void main(String[] args) {
		
		// 일반 고객
		Customer customerLee = new Customer();
		customerLee.setCustomerId("mem_lee");
		customerLee.setCustomerName("Lee");
		
		System.out.println(customerLee.customerInfo());
		System.out.println(customerLee.calcRatio(10000));
		
		// VIP 고객
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerId("mem_kim");
		customerKim.setCustomerName("KIM");
		
		System.out.println(customerKim.customerInfo());
		
		// VIP 고객
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomerId("mem_park");
		customerPark.setCustomerName("Park");
		
		System.out.println(customerPark.customerInfo());

	}

}
