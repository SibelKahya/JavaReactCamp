package inheritance;

public class CustomerManager { 
	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber+" Kaydedildi.");
		
	}
	
	// ayný anda birden fazla müþteri eklemk istiyorum

	public void addMultiple(Customer[] customers) {//çokluekle
		for(Customer customer:customers) {
			
			add(customer);
			
		}
		
		
	}
	
}
