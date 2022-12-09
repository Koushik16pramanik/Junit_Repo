package Com.Employee;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Employee_Test {
	Object [] objarr=new Object[5];
	 @Before
	 public void inItInputs() {
		objarr[0]=(new Employee("Koushik",123,2000));
		objarr[1]=(new Employee("Souvik",121,5000));
		objarr[2]=(new Employee("Saikat",155,7000));
		objarr[3]=(new Employee("Sourav",171,8000));
		objarr[4]=(new Employee("Arnab",135,6000));
	 }
	 @Test
	 public void compare() {
		 //we want to convert the list of objects to array of objects
		 Object[] objarr2=Employee.getEmpList().toArray();
		 assertArrayEquals(objarr, objarr2);
	 }
}
