import java.util.Scanner;

class Employee
{
  String name;
  String empid;
  int salary;
  String designation;
  int experience;

   void setName(String nm)
   {
     name=nm;
   }
  
   String getName()
   {
     return name;
   }

   void setId(String id)
   {
     empid=id;
   }

   String getId()
   {
     return empid;
   }

   void setSalary(int slry)
   {
      salary=slry;
   }

   int getSalary()
   {
      return salary;
   }

   void setDesignation(String ds)
   {
      designation=ds;
   }

   String getDesignation()
   {
     return designation;
   }

   void setExperience(int exp)
   {
     experience=exp;
   }

   int getExperience()
   {
     return experience;
   }

   void raiseSalary()
   {
      float raised_salary=salary*10/100;
      System.out.println("The raise in salary is "+raised_salary+" Rs.");
       float totalSalary=salary+raised_salary;
      System.out.println("Total salary is "+totalSalary+" Rs.");
   }
  
} 

class EmployeeSetGet
{
  public static void main(String []args)
  {
  String name;
  String empid;
  int salary;
  String designation;
  int experience;

   Scanner sc=new Scanner(System.in);

   System.out.println("\nEnter the name of Employee:");
   name=sc.nextLine();

   System.out.println("\nEnter the Employee Id:");
   empid=sc.nextLine();

   System.out.println("\nEnter salary:");
   salary=sc.nextInt();

   System.out.println("\nEnter the designation:");
   designation=sc.next();

   System.out.println("\nEnter the experience in years:");
   experience=sc.nextInt();

   Employee E=new Employee();

   E.setName(name);
   E.setId(empid);
   E.setSalary(salary);
   E.setDesignation(designation);
   E.setExperience(experience);
  

   System.out.println("\n#############Employee Information###########");
   System.out.println("Name:"+E.getName());
   System.out.println("Id:"+E.getId());
   System.out.println("Salary:"+E.getSalary());
   System.out.println("Designation:"+E.getDesignation());
   System.out.println("Experience:"+E.getExperience());
   E.raiseSalary();
  }
}