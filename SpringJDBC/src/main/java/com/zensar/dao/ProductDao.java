package com.zensar.dao;
/**
 * @author Priya Mirchandani
 * @creation_date 4 october 2019 10.06am
 * @modification_date 4 october 2019 10.06am
 * @version 1.0
 * @copyright Zensar Technologies.all rights reserved
 * @description it is a dao interface using persistance layer
 *
 */
import java.util.List;



import com.zensar.entities.Product;



public interface ProductDao 
{
    
	List<Product> getAll();
	Product getById(int productId);
    void insert(Product product);
    void update(Product product);
    void delete(Product product);
}
