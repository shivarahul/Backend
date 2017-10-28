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
public void saveUser()
{
	User user=new User();
    //user.setId(24);
    user.setEmail("rahul@gmail.com");
    user.setFirstName("Rahul");
    user.setEnabled(true);
    user.setLastName("shiva");
    user.setPassword("rahul");
    user.setRole("ROLE_ADMIN");
    user.setPhone("nokia");
 
	boolean flag=userDAO.saveOrUpdate(user);
	assertEquals("createUserTestCase", true, flag);
}
}

*/