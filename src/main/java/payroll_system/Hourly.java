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
		if (this.rate <= 40)
		{
			return super.pay();
		} else
		{
			float pay_more = (float) ((this.hours - 40) * (1.5 * this.rate));
			return super.pay() + pay_more;
		}

	}

}
