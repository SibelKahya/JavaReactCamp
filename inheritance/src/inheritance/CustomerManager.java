package inheritance;

public class CustomerManager { 
	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber+" Kaydedildi.");
		
	}
	
	// ayn� anda birden fazla m��teri eklemk istiyorum

	public void addMultiple(Customer[] customers) {//�okluekle
		for(Customer customer:customers) {
			
			add(customer);
			
		}
		
		
	}
	
}
