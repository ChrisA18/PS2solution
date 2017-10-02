package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

public class myIntegerTest {

	@Test
	public void testEven() {
		
		MyInteger myInt = new MyInteger(2);
		
		//assertTrue(myInt.isEven());
		
		//assertTrue(myInt.isEquals(2));
		
		assertFalse(myInt.isOdd());
		
	}

}
