/*package com.backend.test;


	import static org.junit.Assert.*;

	import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.annotation.ComponentScan;

	import com.backend.DAO.SupplierDAO;
import com.backend.Dbconfig.Dbconfig;
import com.backend.model.Product;
import com.backend.model.Supplier;


	@SuppressWarnings("unused")
	@ComponentScan("com.backend")
	public class SupplierTest {
		@Autowired
		private static SupplierDAO supplierDAO;
		
			
		@BeforeClass
		public static void initialize()
		{
			@SuppressWarnings("resource")
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.register(Dbconfig.class);
			context.scan("com.backend.*");
			context.refresh();
			
				//supplier = (Supplier) context.getBean("supplier");
				supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		}
		
		@Ignore
		@Test
		public void createSupplier()
		{
			Supplier supplier=new Supplier();
			supplier.setSuppliername("prime");
			
			
			boolean flag=supplierDAO.createSupplier(supplier);
			assertEquals("createSupplierTestCase", true, flag);
		}
	
		@Ignore  
		@Test
		public void deleteSupplier()
		
		{

			Supplier supplier= new Supplier();
			
		supplier.setSuppliername("prime");
				

				boolean flag=supplierDAO.deleteSuppler(44);
				
				assertEquals("createsupplierTestCase",true,flag);
		}


@Ignore
	@Test
	public void updateSupplier()
	{
		Supplier sp = new Supplier();
		boolean flag=supplierDAO.updateSupplier(sp);
		assertEquals("createSupplierTestCase", true, flag);
	}
@Test
public void retrieveSupplier()
{
	Supplier sp = new Supplier();
	boolean listsupplier=supplierDAO.getSupplier(40);
	assertNotNull("supplier in getting by id",sp);
}
	}*/