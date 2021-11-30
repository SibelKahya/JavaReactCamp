package oopIIntro;

public class Product {
	
	public Product() {  //constructor = yapýcý fonksiyon
		System.out.println("Ben Çalýþtým ");
		
	}
	public Product(int id,String name,double unitPrice,String detail) { // bir constructoor çalýþmak zorunda  // birden fazla constructor varsa sadece biri çal8ýþmak zorunda
		this(); // constructor lar ile birbirini çalýþtýrabiliriz bu yazdýðýmýz this() yukarýdaki constructor ý çalýþtýracak
		this.id=id; 
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
		
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
