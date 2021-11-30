package oopIIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo 14",15000,"16 GB Ram");// örnek oluþturma ,referans oluþturma ,intance oluþturma 
		
		/*product1.id=1;
		product1.name="Lenovo 14";    //bunlarý yukarýda parantez içine yazdýk ve product constructor unda this.id =id vs eþitledik o yüzdn bu kalabalýk satýra gerek kalmamýþ oldu
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";*/ 
		
		Product product2= new Product();// örnek oluþturma ,referans oluþturma ,intance oluþturma 
		product2.id=2;
		product2.name="Lenovo 15";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3= new Product();// örnek oluþturma ,referans oluþturma ,intance oluþturma 
		product3.id=3;
		product3.name="HP 5";
		product3.unitPrice=10000;
		product3.detail="8GB Ram";
		
		
		
	    Product[] products= {product1,product2,product3};
	    
	    for(Product product: products) { // product= takma isim  // product lar için her bir productý tek tek dolaþ demek 
	    	System.out.println(product.name);
	    	
	    	
	    }
	    
      System.out.println(products.length);
      Category category1=new Category();
      category1.id=1;
      category1.name="Bilgisayar";
      
      Category category2=new Category();
      category2.id=2;
      category2.name="Ev/Bahçe";
      
      ProductManager productManager=new ProductManager();
      productManager.addToCart(product1);   //istediðin kadar çaðýrabilirsin
      productManager.addToCart(product2);
      productManager.addToCart(product3);
      
	}

}
