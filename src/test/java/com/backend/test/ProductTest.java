package com.backend.test;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.backend.DAO.ProductDAO;
import com.backend.Dbconfig.Dbconfig;
import com.backend.model.Product;


@SuppressWarnings("unused")
@ComponentScan("com.backend")
public class ProductTest {
	@Autowired
	private static ProductDAO productDAO;
	
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Dbconfig.class);
		context.scan("com.backend.*");
		context.refresh();
        productDAO = (ProductDAO) context.getBean("productDAO");
		
		
	}

@Test
public void createProduct()
{
	Product p=new Product();
	p.setName("iphone X");
	p.setQuantity(5);
	p.setPrice(99999);
	boolean flag=productDAO.createProduct(p);
	assertEquals("createProductTestCase", true, flag);
}
@Ignore
@Test
public void retrieveProduct()
{
	Product product=new Product();
	boolean listproduct=productDAO.getProduct(12);
	assertNotNull("problem in getting by id", product);
}
@Ignore
@Test
public void deleteProduct()
{
	Product product = new Product();
	product.setName("iphone");
	product.setQuantity(5);
	boolean flag=productDAO.deleteProduct(1);
	assertEquals("createProductTestCase", true, flag);
}
@Ignore
@Test
public void updateProduct1()
{
	Product product = new Product();
	boolean flag=productDAO.updateProduct(product);
	assertEquals("createProductTestCase", true, flag);
}
}

