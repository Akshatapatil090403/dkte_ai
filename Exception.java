import java.util.Scanner;
class Exception
{
	public static void main(String[] args) 
	{
		 String s; 
                 int divisor,dividend,index;
                 float Quotient;
                 Scanner sc=new Scanner(System.in);

		try {
                         
                
                System.out.println("\nEnter the string");
                s=sc.next();
                 System.out.println("\nEnter the index:");
                 index=sc.nextInt();	

                System.out.print(s.charAt(index));
		    

               try{
                    System.out.println("\nEnter the divisor:");
                    divisor=sc.nextInt();
                    System.out.println("\nEnter the dividend:");
                    dividend=sc.nextInt();

                    Quotient=divisor/dividend;
                    System.out.println("\nQuotient is:"+Quotient);
                    
                  }
              catch(ArithmeticException ae)
            {
                  System.out.println("\n Cannot divide by zero");
            }

}
             catch (StringIndexOutOfBoundsException e) 
		    {
			System.out.println("No position");
			System.out.println(e.toString());
                    }
        }
}