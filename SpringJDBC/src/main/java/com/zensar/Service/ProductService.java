package com.zensar.Service;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Priya Mirchandani
 * @creation_date 4 october 2019 10.06am
 * @modification_date 10 october 2019 5.38pm
 * @version 3.0
 * @copyright Zensar Technologies.all rights reserved
 * @description it is a Service interface using business layer
 *
 */
public interface ProductService {
      List<Product>findAllProducts();
      Product findProductById(int productId);
      void add(Product product);
      void update(Product product);
      void remove(Product product);
      List<Product>findProductsByPriceRange(float maxPrice,float minPrice);
      List<Product>findProductByName(String name);
      List<Product>findProductByBrand(String brand);
      long getProductCount();
}
