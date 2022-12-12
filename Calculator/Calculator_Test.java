package Com.Demo.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import Com.Demo.Main.Calculator;

	@RunWith (Parameterized.class)		// to specify its runner class name
public class Calculator_Test {
		private int FirstNumber,SecondNumber,Result;
		private Calculator cal;
		public Calculator_Test (int FirstNumber, int SecondNumber, int Result) {
			this.FirstNumber = FirstNumber;
			this.SecondNumber = SecondNumber;
			this.Result = Result;
		}
		@Before
		public void initialize() {
			cal= new Calculator();
		}
		@Parameterized.Parameters
		public static Collection generateData() {
			return Arrays.asList(new Object [][] {{1,2,3},{5,6,11},{3,7,10}}); // convert the data into list
		}
		@Test
		public void Testing() {
			System.out.println("sum of numbers : "+Result);
			assertEquals(Result, cal.sum(FirstNumber, SecondNumber));
		}
}
