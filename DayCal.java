import java.util.Scanner;

class age
{
  
  void calculateDays(int present_d,int present_m,int present_y,int birth_d,int birth_m,int birth_y)
   {      
    
      arr[1]=31;
      arr[2]=28;
      arr[3]=31;
      arr[4]=30;
      arr[5]=31;
      arr[6]=30;
      arr[7]=31;
      arr[8]=31;
      arr[9]=30;
      arr[10]=31;
      arr[11]=30;
      arr[12]=31;



  int count1=(arr[birth_m]-birth_date);
         
  int count2=0;
  for(int i=birth_m+1;i<=12;i++)
      {
        if(birth_y%4==0 || birth_y%400==0)
           {
             arr[2]=29;  
           }
         count2=arr[i]+count2;
      }

 int flag=((present_y-1)-(birth_y+1))
 count3=flag*365;

int count4=0
for(int i=1;i<month;i++)
   {
      if(birth_y%4==0 || birth_y%400==0)
           {
             arr[2]=29;  
           }
       count4=arr[i]+count4;
   }
count4=count4+present_d;

for(int i=birth_y+1;i<=present_y-1;i++)
   {
      if(i%4==0 || i%400==0)
           {
                temp++;
           }

   }
      
int days=count1+count2+count3+count4+temp;
 }

}

class DayCal{

	public static void main(Strings []args)
               {
			 age A= new age();
				 int present_d,present_m,present_y;
   				int birth_d,birth_m,birth_y;
   				Scanner sc= new Scanner(System.in);
 
   				 System.out.println("Enter the present date");
     					present_d=sc.nextInt();
     					present_m=sc.nextInt();
    				        present_y=sc.nextInt();
     				System.out.println("Enter the birth date");
					birth_d=sc.nextInt();
					birth_m=sc.nextInt();
					birth_y=sc.nextInt();

      
                         days=A.calculateDays(int present_d,int present_m,int present_y,int birth_d,int birth_m,int birth_y);
                       System.out.println("your birth date " +days+ "th days");
	       }

    

}