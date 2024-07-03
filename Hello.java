import java.util.Scanner;

 class Bday{
    int birth_date,birth_month,birth_year,age;
    void calc()
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the day,month and year:");
    birth_date=sc.nextInt();
    birth_month=sc.nextInt();
    birth_year=sc.nextInt();
    age=2023-birth_year;
    System.out.println("The age is:"+age);
    
}

}


public class Hello{
           public static void main(String []args)
           { 
   		Bday B=new Bday();
  		 B.calc();

  	   }

}