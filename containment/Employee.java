package containment;

class Employee 
{
	public int emp_id;
	public String emp_name;
	public String emp_city;
	public EmpDate emp_dob;
	public Employee(int emp_id, String emp_name, String emp_city,EmpDate emp_dob)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_city=emp_city;
		this.emp_dob=emp_dob;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", emp_dob="
				+ emp_dob + "]";
	}
	
	

}


