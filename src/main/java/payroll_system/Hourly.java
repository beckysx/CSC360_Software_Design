package payroll_system;

public class Hourly extends Employee
{

	public Hourly(String name, float rate, int hours)
	{
		super(name, rate, hours);
	}

	@Override
	public float pay()
	{
		if (hours <= 40)
		{
			return super.pay();
		} else
		{
			float pay_more = (float) ((hours - 40) * (1.5 * rate));
			return rate * 40 + pay_more;
		}

	}

}
