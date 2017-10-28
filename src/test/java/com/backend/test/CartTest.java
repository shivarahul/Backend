/*package com.backend.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.backend.DAO.CartDAO;
import com.backend.Dbconfig.Dbconfig;
import com.backend.model.Cart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

;
@ComponentScan("com.backend")
public class CartTest
{
	@Autowired
	private static CartDAO cartDAO;
	
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Dbconfig.class);
		context.scan("com.backend.*");
		context.refresh();
		cartDAO=(CartDAO)context.getBean("cartDAO");
	}
	@Test
	public void createCart()
	{
		Cart cart=new Cart();
		
		cart.setProductid(44.2222);
		cart.setProductid(22244);
		cart.setProductName("choc overdose");
		cart.setQuantity(42);
		cart.setStatus("good tasty");
		cart.setUsername("rahul");

		boolean flag=cartDAO.createCart(cart);
		assertEquals("creatCartTestCase",true,flag);
	}
	@Ignore
	@Test
	
	public void updateCart()
	{
		Cart cart = new Cart();
		boolean flag=cartDAO.updateCart(cart);
		assertEquals("createCartTestCase", true, flag);
	}
	@Ignore
	@Test
	public void deleteCart()
	{
		Cart cart = new Cart();
		cart.setCartid(10);
		cart.setProductPrice(100.23);
		cart.setProductid(23);
		cart.setProductName("ice cream");
		cart.setQuantity(10);
		cart.setStatus("y");
		cart.setUsername("Anuroop");
		boolean flag=cartDAO.deleteCart(39);
		assertEquals("createCartTestCase", true, flag);
	}
	

	

}


*/