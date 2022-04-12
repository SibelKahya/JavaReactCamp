package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
    @SuppressWarnings("deprecation")
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient= new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			
			
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}
		
		
		
		
		/*
		 * return kpsPublic.TCKimlikNoDogrula(
		 * 
		 * Long.parseLong(customer.getNationalityId()),
		 * customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
		 * customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault().
		 * toLocalDate.getYear()) );
		 */
		
	

}
