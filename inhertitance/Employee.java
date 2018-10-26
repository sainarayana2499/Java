package inhertitance;
class Employee 
{
	public int emp_id;
	public String emp_name;
	public int emp_sal;
	public int emp_da;
	public int emp_fa;
	public Employee(int emp_id, String emp_name, int emp_sal,int emp_da,int emp_fa)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
		this.emp_da=emp_da;
		this.emp_fa=emp_fa;
	}
	public int calculate()
	{
		return emp_sal+emp_da+emp_fa;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + ", emp_da=" + emp_da
				+ ", emp_fa=" + emp_fa + "]";
	}
}
