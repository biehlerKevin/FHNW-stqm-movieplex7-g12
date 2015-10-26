package EntityTest;


import org.javaee7.movieplex7.entities.Sales;
import org.junit.*;


import static org.junit.Assert.*;

import org.hamcrest.*;

public class TestSalesEntity {

	Sales sale1;
	Sales sale2;
	Sales sale3;
	
	@Before 
	public void setUp() throws Exception{
		sale1 = new Sales();
		sale2 = new Sales(10);
		sale3 = new Sales(15,100);
	}
	
	@After
	public void tearDown() throws Exception{
	}


	@Test
	public void testFirstConstructor(){
		assertTrue(sale1.getId() == null);
		//Primitive double initializes to 0.0
		assertTrue(sale1.getAmount() == 0.0);
	}
	
	@Test
	public void testSecondConstructor(){
		assertTrue(sale2.getId() == 10);
		//Primitive double initializes to 0.0
		assertTrue(sale2.getAmount() == 0.0);
	}
	
	@Test
	public void testThirdConstructor(){
		assertTrue(sale3.getId() == 15);
		assertTrue(sale3.getAmount() == 100);
	}
	
	@Test
	public void testEquals(){
		//Check instanceOf
		assertFalse(sale1.equals(new String()));
		
		assertTrue(sale3.equals(sale3));
		
		//Only checks ID
		Sales sale4 = new Sales(15, 1299323);
		assertTrue(sale3.equals(sale4));
		
		assertFalse(sale2.equals(sale3));
		assertTrue(sale2.equals(sale2));
		
		assertTrue(sale1.equals(sale1));
		assertFalse(sale1.equals(sale3));
		
		
	}
}
