package oopIIntro;

public class Product {
	
	public Product() {  //constructor = yap�c� fonksiyon
		System.out.println("Ben �al��t�m ");
		
	}
	public Product(int id,String name,double unitPrice,String detail) { // bir constructoor �al��mak zorunda  // birden fazla constructor varsa sadece biri �al8��mak zorunda
		this(); // constructor lar ile birbirini �al��t�rabiliriz bu yazd���m�z this() yukar�daki constructor � �al��t�racak
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
