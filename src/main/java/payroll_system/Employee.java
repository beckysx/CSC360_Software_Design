package payroll_system;

public class Employee
{
	String name;
	float rate;
	int hours;

	public Employee(String name, float rate, int hours)
	{
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public float pay()
	{
		return this.rate * this.hours;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the rate
	 */
	public float getRate()
	{
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(float rate)
	{
		this.rate = rate;
	}

	/**
	 * @return the hours
	 */
	public int getHours()
	{
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours)
	{
		this.hours = hours;
	}

}
