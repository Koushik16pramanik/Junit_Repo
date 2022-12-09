package Com.Demo.Test;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import Com.Demo.Main.Junit_Demo1;
//Q.3  In Eclipse, run MyEvenOddTest class as JUnit Test.
public class Junit_Test1 {
	@Test
	public void max() {
		assertEquals(6,Junit_Demo1.max(new int[] {1,2,5,4,6}));
	//	assertEquals(-1,Junit_Demo1.max(new int[] {-1,-2,-5,-4,-6}));
	}
}
