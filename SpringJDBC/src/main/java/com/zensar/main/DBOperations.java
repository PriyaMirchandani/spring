package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.Service.ProductService;
import com.zensar.entities.Product;

public class DBOperations {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService=ac.getBean("productServiceImpl",ProductService.class);
		/*List<Product>products=productService.findAllProducts();  //displaying all products
		for (Product product : products) {
			System.out.println(product);
		}
		*/

		/*Product product=productService.findProductById(110);
		System.out.println(product);
		*/
		/*Product product= new Product(102,"tablet" , "sony", 35000); //insertion
		productService.add(product);
		*/
		
		Product product=productService.findProductById(110);    //updating product 
		
		if(product!=null)
		{
			product.setName("mouse");
			product.setBrand("zebronics");
			product.setPrice(23000);
			productService.update(product);
		}
		else
		{
			System.out.println("product not found");
		}
		
		
     /*  Product product=productService.findProductById(110);  //deleting product
		
		if(product!=null)
		{
			
			productService.remove(product);
		}
		else
		{
			System.out.println("product not found");
		}
		*/
	}

}
