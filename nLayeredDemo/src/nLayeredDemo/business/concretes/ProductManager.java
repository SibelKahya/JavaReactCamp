package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}
	
    public void add(Product product) {  
		
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor.");
			return;
			
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi"+ product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
