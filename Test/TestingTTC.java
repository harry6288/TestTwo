import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingTTC {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//R1 : A one way trip inside Zone 1
	@Test
	public void testInsideZone() {
		String[] from1 = new String[] {"Leslie"};
		String[] to1 = new String[] {"Don Mills"};
		TTC r = new TTC();
		Double result = r.calculateTotal(from1, to1);
		assertEquals(2.50,result,0.0);
		
	}
	// R2 :A one way trip inside Zone 2
	
	@Test
	public void testInsideZone2() {
		String[] from1 = new String[] {"Sheppard"};
		String[] to1 = new String[] {"Finch Station"};
		TTC r = new TTC();
		Double result = r.calculateTotal(from1, to1);
		assertEquals(3.0,result,0.0);
		
	}
	
	//R3 : A trip between Zones
	@Test
	public void testBetweenZone() {
		String[] from1 = new String[] {"Don Mills"};
		String[] to1 = new String[] {"Finch Station"};
		TTC r = new TTC();
		Double result = r.calculateTotal(from1, to1);
		assertEquals(3.0,result,0.0);
		
	}
	//R4 : More than 1 trip
	@Test
	public void testMoreThanOne() {
		
		String[] from1 = new String[] {"Finch Station","Leslie"};
		String[] to1 = new String[] {"Sheppard","Don Mills"};
		
		
		TTC r = new TTC();
		Double result = r.calculateTotal(from1, to1);
		assertEquals(5.50,result,0.0);
		
	}
	
	
	
	
}
