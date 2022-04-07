package inheritance;  //Miras: 2 adet sýnýfýmýz var bu iki sýnýftan bazý operasyonlar ortak 

public class Main {

	public static void main(String[] args) {
	IndividualCustomer engin =new IndividualCustomer();
	engin.customerNumber="12345";
	
	CorporateCutomer hepsiBurada=new CorporateCutomer();
	hepsiBurada.customerNumber="78910";
	
	SendikaCustomer abc=new SendikaCustomer();
	abc.customerNumber="9999";
	
	/*CustomerManager customerManager= new CustomerManager();
	customerManager.add(hepsiBurada);
	customerManager.add(engin);
    customerManager.add(abc);*/ //veya aþaðdaki gibi kýsa yolla 
	
	CustomerManager customerManager= new CustomerManager();
	Customer[] customers= {engin,abc,hepsiBurada};
	
    customerManager.addMultiple(customers);
	
	
	}

}
