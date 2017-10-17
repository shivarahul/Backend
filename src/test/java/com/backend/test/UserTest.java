/*package com.backend.test;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.backend.DAO.UserDAO;
import com.backend.Dbconfig.Dbconfig;
import com.backend.model.User;


@SuppressWarnings("unused")
@ComponentScan("com.backend")
public class UserTest
{
	@Autowired
	private static UserDAO userDAO;
	

	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.register(Dbconfig.class);
		context.refresh();
        
		userDAO=(UserDAO)context.getBean("userDAO");
		
	}

@Test
public void createUser()
{
	User user=new User();
    user.setMailid("avcfd@gmail.com");
    user.setAddress("hyd");
    user.setPassword("54321");
    user.setRole("assistant manager");
    user.setUsername("Rohith");
    user.setCustomername("prakash");
   
	boolean flag=userDAO.createUser(user);
	assertEquals("createUserTestCase", true, flag);
}
}


*/