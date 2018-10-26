package inhertitance;
class Manager extends Employee 
{
	public int emp_id;
	public String emp_name;
	public int emp_sal;
	public int emp_da;
	public int emp_fa;
	public int man_ra;
		
	public Manager(int emp_id, String emp_name, int emp_sal,int emp_da,int emp_fa,int man_ra)
	{
		super(emp_id, emp_name,emp_sal,emp_da,emp_fa);
		this.man_ra=man_ra;
	}
	public int calculate()
	{
		return super.calculate()+man_ra;
	}
	@Override
	public String toString() {
		return "Manager [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + ", emp_da=" + emp_da
				+ ", emp_fa=" + emp_fa + ", man_ra=" + man_ra + "]";
	}
	
}
