import java. util.Scanner;
class SavingAccount
{
	static float rate=0.02f;

	static float calintrest(float amount,int time)
	{
		float interest;
		interest = amount*rate*time;
		return  interest;
	}

     static float modify_intr(float intr_rate) 
        {
          rate=intr_rate;
       } 
}
class Saving
{

	public static void main(String[]args)
   {
	float interest,amt;
	int time,A,B;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("\nEnter the principle amount :");
	amt=sc.nextFloat();
	System.out.print("\nEnter the time period : ");
	time=sc.nextInt();

	float interest=SavingAccount.calintrest(amt,time);
        System.out.println("\nInterest is:"+interest);
        
        System.out.print("\nEnter the rate: ");
	float intr_rate=sc.nextInt();

        float interest=SavingAccount.modify_int(intr_rate);
        float interest=SavingAccount.calintrest(amt,time);
        System.out.println("\nNew Interest is:"+interest);
          
   }

}