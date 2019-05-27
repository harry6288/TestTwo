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

}
