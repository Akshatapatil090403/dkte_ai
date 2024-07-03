import java.util.Scanner;
class Employee
{
	String Name;
	String gender;
	int age;
	long Salary;
	String designation;
	int Id;
	Employee(int i,String na,String des,int ag,String gen)
	{
		this.Id=i;
		this.Name = na;
		this.designation=des;
		this.age=ag;
		this.gender=gen;
	}

	void setName(String na)
	{
		Name=na;
	}
	String getName()
	{
		return Name;
	}
	void setAge(int ag)
	{
		age=ag;
	}
	int getAge()
	{
		return age;
	}
	void setgender(String gen)
	{
		gender=gen;
	}
	String getgender()
	{
		return gender;
	}
	void getdesignation(String des)
	{
		designation=des;
	}
	String setdesignation()
	{
		return designation;
	}
	void setsalary(long s)
	{
		Salary=s;
	}
	long getsalary()
	{
		return Salary;
	}

	void setId(int i)
	{
		Id=i;
	}
	int getId()
	{
		return Id;
	}
	long RiseSalary()
	{
		long sal, total_salary;
		sal = (long)(0.1f * getsalary());
		total_salary=  getsalary() + sal;
		return total_salary;	
	}
	void employeeinfo()
	{
		System.out.print("\nEmployee name:"+Name);
		System.out.print("\nEmployee ID:"+Id);
		System.out.print("\nEmployee Designation:"+designation);
		System.out.print("\nEmployee Gender:"+gender);
		System.out.print("\nEmployee Age:"+age);
	}
}
class EmployN
{
	public static void main( String []args)
	{
		String Name;
		String gender;
		int age;
		long Salary;
		String designation;
		int Id;
		Scanner sc=new Scanner(System.in);

		System.out.print("\nEnter the Employee name :");
		Name=sc.nextLine();

		System.out.print("\nEnter the Employee Designation :");
		designation=sc.nextLine();

		System.out.print("\nEnter the Employee Gender :");
		gender=sc.nextLine();

		System.out.print("\nEnter the Employee ID :");
		Id=sc.nextInt();

		System.out.print("\nEnter the Employee Age :");
		age=sc.nextInt();

		Employee E=new Employee(Id,Name,designation,age,gender);
		System.out.print("\nEnter the Employee Salary :");
		Salary=sc.nextLong();

		E.setsalary(Salary);
		long sal=E.getsalary();
		E.employeeinfo();
		System.out.println("\nInitial salary of Employee :" +sal);
System.out.println("Incremented salary of Employee :" +E.RiseSalary());
	}
}


