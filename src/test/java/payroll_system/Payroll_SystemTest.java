package payroll_system;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Payroll_SystemTest
{
	Payroll_System payments;
	Contractor c= new Contractor("C-C", 15, 50);

	@BeforeEach
	void setUp() throws Exception
	{
		payments = new Payroll_System();
		payments.add_employee(new Hourly("A-H", 10, 45));
		payments.add_employee(new Hourly("B-H", 10, 30));
		payments.add_employee(c);
		payments.add_employee(new Salary("D-S", 10));
		
	}

	@Test
	void testAdd_employee()
	{
		assertEquals(4,payments.num);
		payments.add_employee(new Salary("E-S", 10));
		assertEquals(5,payments.num);
		
	}

	@Test
	void testPayments()
	{
		assertArrayEquals(new float[] {475,300,750,400}, payments.payments());
	}

	@Test
	void testChange_hour() throws PersonNonExistException
	{
		payments.change_hour("C-C", 30);
		assertEquals(30, c.getHours());
		
	}
	
	@Test
	void testPay_System() {
		assertThrows(PersonNonExistException.class,()->{
			payments.change_hour("S-S", 2);
		} );
	}

}
