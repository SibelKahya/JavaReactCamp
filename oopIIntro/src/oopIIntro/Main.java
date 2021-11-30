package oopIIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo 14",15000,"16 GB Ram");// �rnek olu�turma ,referans olu�turma ,intance olu�turma 
		
		/*product1.id=1;
		product1.name="Lenovo 14";    //bunlar� yukar�da parantez i�ine yazd�k ve product constructor unda this.id =id vs e�itledik o y�zdn bu kalabal�k sat�ra gerek kalmam�� oldu
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";*/ 
		
		Product product2= new Product();// �rnek olu�turma ,referans olu�turma ,intance olu�turma 
		product2.id=2;
		product2.name="Lenovo 15";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3= new Product();// �rnek olu�turma ,referans olu�turma ,intance olu�turma 
		product3.id=3;
		product3.name="HP 5";
		product3.unitPrice=10000;
		product3.detail="8GB Ram";
		
		
		
	    Product[] products= {product1,product2,product3};
	    
	    for(Product product: products) { // product= takma isim  // product lar i�in her bir product� tek tek dola� demek 
	    	System.out.println(product.name);
	    	
	    	
	    }
	    
      System.out.println(products.length);
      Category category1=new Category();
      category1.id=1;
      category1.name="Bilgisayar";
      
      Category category2=new Category();
      category2.id=2;
      category2.name="Ev/Bah�e";
      
      ProductManager productManager=new ProductManager();
      productManager.addToCart(product1);   //istedi�in kadar �a��rabilirsin
      productManager.addToCart(product2);
      productManager.addToCart(product3);
      
	}

}
