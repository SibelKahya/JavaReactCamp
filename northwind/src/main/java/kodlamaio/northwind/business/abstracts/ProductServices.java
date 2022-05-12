package kodlamaio.northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import lombok.Data;

public interface ProductServices {
	
	DataResult<List<Product>>getAll();
	
	DataResult<List<Product>> getAllSorted();
	
	DataResult<List<Product>>getAll(int pageNo,int psgeSize);
	
	Result add(Product product);

	
	DataResult<Product> getByProductname(String productName);
	
	DataResult<Product>  getByProductNameAndCategoryId(String productName,int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName,int categoryId);
	
	DataResult< List<Product>> getCategoryIdIn(List<Integer> categories); //In:mesela categoryId si 1,2,3,4 olanları getir diyrosak In kullanırız
                                                             // Liste şeklinde categorileri getir
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
	
}
