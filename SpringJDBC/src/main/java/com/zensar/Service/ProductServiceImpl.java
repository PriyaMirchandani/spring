package com.zensar.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
	private ProductDao productDao; 
	
	
	
	
	@Override
	public List<Product>findAllProducts() {
		
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		
		return productDao.getById(productId);
	}

	@Override
	public void add(Product product) {
		
		productDao.insert(product);
	}

	@Override
	public void update(Product product) {
		
		productDao.update(product);
	}

	@Override
	public void remove(Product product) {
	
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float maxPrice, float minPrice) {

		List<Product>products=productDao.getAll();
		List<Product> products1=new ArrayList<>();
	 
		for (Product product : products) {
			 if(product.getPrice()>=minPrice&&product.getPrice()<=maxPrice)
			 {
				 products1.add(product);
			 }
		}
		return products1;
	}

	@Override
	public List<Product> findProductByName(String name) {
		
		List<Product>products=productDao.getAll();
		List<Product> products1=new ArrayList<>();
		for (Product product : products) 
		{
			if(product.getName().equals(name))
			{
				products1.add(product);
			}
		}
		return products1 ;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
	
		
		List<Product>products=productDao.getAll();
		List<Product> products1=new ArrayList<>();
	    for (Product product : products) {
			if(product.getBrand().equals(brand))
			{
				products1.add(product);
			}
		}
	     return products1;
	}
	
	

	@Override
	public long getProductCount() {
		
		List<Product>products=productDao.getAll();
		long count=products.size();
		return count;

}
}
