package guviTask10_;

public class Employee {
	int emp_id, emp_salary;
	String emp_fname, emp_Lname;
	
	// creating the getter and setter properties
	
	public int getEmp_id()
	{
		return emp_id;
	}
	public void setEmp_id(int emp_id)
	{
		this.emp_id = emp_id;
	}
	public int getsalary()
	{
		return emp_salary;
		
	}
	public void setsalary(int emp_salary)
	{
		this.emp_salary = emp_salary;
		
	}
	public String  getFname()
	{
		return emp_fname;
	}
	public void setFname(String emp_fname)
	{
		this.emp_fname = emp_fname;
	}
	public String  getLname()
	{
		return emp_Lname;
	}
	public void setLname(String emp_Lname)
	{
		this.emp_Lname = emp_Lname;
	}
	//overriding
	public String toString()
	{
		return "Employee details Id = "+emp_id + "\n Salary = "+emp_salary + "\n fname = " + emp_fname + "\n Lname = "+emp_Lname+"\n " ;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(); //create the object of employee details
		
		//setting value of the properties
		emp.setEmp_id(123);
		emp.setFname("Akshara");
		emp.setLname("Santosh");
		emp.setsalary(30000);
		//showing Employee details
		System.out.println(emp);
		
		int sal = emp.getsalary();
		int increment = 0;
		
		//increment salary based on condition
		if((sal >=10000) && (sal <=50000))
		{
			//increment salary 2%
			increment +=(sal * 2)/100;
			sal =sal+increment;
			emp.setsalary(sal);;
			System.out.println("\n Salary is Increment \n");
			System.out.println(emp);
		}
		else if((sal >=50000) && (sal <=70000))
		{
			//increment salary 5%
			increment +=(sal * 5)/100;
			sal =sal+increment;
			emp.setsalary(sal);;
			System.out.println("\n Salary is Increment \n");
			System.out.println(emp);
		}
		else
		{
			System.out.println("\n Salary is not Increment \n");
			System.out.println(emp);
		}
		}
		}
		
		
        
	