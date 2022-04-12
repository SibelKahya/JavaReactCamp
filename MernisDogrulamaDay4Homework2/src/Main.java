import java.rmi.RemoteException;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
//import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("SÝBEL");
		customer.setLastName("KAHYA");
		customer.setNationalityId("10101010101");
		customer.setDateOfBirth(new Date(1992));
		
		 BaseCustomerManager basecustomerManager= new NeroCustomerManager();
		 basecustomerManager.Save(customer);
		 


}}
