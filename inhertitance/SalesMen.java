package inhertitance;
class SalesMen extends Employee
{
	
	public int sales_ra;
	public SalesMen(int emp_id, String emp_name, int emp_sal,int emp_da,int emp_fa,int sales_ra)
	{
		super(emp_id, emp_name,emp_sal,emp_da,emp_fa);
		this.sales_ra=sales_ra;
	}
	public int calculate()
	{
		return super.calculate()+sales_ra;
	}
	@Override
	public String toString() 
	{
		return "SalesMen [sales_ra=" + sales_ra + "]";
	}
	
	
}
