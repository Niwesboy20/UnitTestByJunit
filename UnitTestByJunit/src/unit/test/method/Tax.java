package unit.test.method;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tax {
	
	 //* Unit test for Business Logic  
	 //* Test Method 
	 
	
	private double TAX = 0.07 ;
	private double SERVICE = 0.1 ;
	
	@Test
	public void FoodTax(){
		
		double total = 1000 ;
		
		total += total * TAX ;
		// Pass
		assertEquals(1070 , total , 0);

	}
	
	@Test
	public void ServiceTax(){
		
		double total = 1500 ;
		
		total += total * SERVICE ;
		// False
		assertEquals(1500 , total , 0);

	}

	@Test
	public void foodServiceTax(){
		
		double total = 1500 ;
		
		total += total * TAX ;
		total += total * SERVICE ;
		// Pass
		assertEquals(1765.5 , total , 0);

	}
}
