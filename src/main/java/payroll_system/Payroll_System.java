/**
 * 
 */

package payroll_system;

import java.util.ArrayList;

/**
 * @author beckysx
 *
 */
public class Payroll_System
{
	ArrayList<Employee> employees = new ArrayList<Employee>();
	int num = 0;

	public Payroll_System()
	{

	}

	public void add_employee(Employee e)
	{
		employees.add(e); // adding a new employee to system
		this.num = employees.size();
	}

	public float[] payments()
	{
		float[] pays = new float[num];
		for (int i = 0; i < num; i++)
		{
			Employee e = employees.get(i);
			pays[i] = e.pay();
		}
		return pays;
	}

	public void change_hour(String name, int hour) throws PersonNonExistException
	{
		int i = findEmployee(name);
		if (i == -1)
			throw new PersonNonExistException();
		else
		{
				employees.get(i).setHours(hour);
		}

	}

	private int findEmployee(String name)
	{
		for (int i = 0; i < num; i++)
		{
			Employee e = employees.get(i);
			if (e.getName().equals(name))
				return i;
		}
		return -1;
	}

}
