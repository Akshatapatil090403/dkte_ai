import java.util.Scanner;

class age
{
   int pd,pm,py;
   int bd,bm,by;
   Scanner sc= new Scanner(System.in);
  void Age()
   { 
     System.out.println("Enter the present date");
     pd=sc.nextInt();
     pm=sc.nextInt();
     py=sc.nextInt();
     System.out.println("Enter the birth date");
	bd=sc.nextInt();
	bm=sc.nextInt();
	by=sc.nextInt();
      int d,m,y;
      int md[] = {31,28,31,30,31,30,31,31,30,31,30,31};
      y=py-by;
       
      if(pm<bm)
      {
        y--;
        m=12-(bm-pm);
        
      }
      else
       {
         m=pm-bm;
        
       }
     if(pd<bd)
      {
        d=md[pm-1]-(bd-pd);
        
      }
     else
      {
        d=pd-bd;
       
      }
     System.out.println("Your age is=  ");
     System.out.println("year="+y);
     System.out.println("months="+m);
     System.out.println("days="+d);
       y=sc.nextInt();
       m=sc.nextInt();
      d=sc.nextInt();
   }

int calculateDays()
   {
      int bdate,bmonth,byear;
     System.out.println("Enter the birth date");
	bdate=sc.nextInt();
	bmonth=sc.nextInt();
	byear=sc.nextInt();
      int jan=31;
      int feb=28;
      int march=31;
      int april=30;
      int may=31;
      int june=30;
      int july=31;
      int aug=31;
      int sept=30;
      int oct=31;
      int nov=30;
      int dec=31;

      if(byear%4==0 || byear%400==0)
       {
          feb=29;
       }

      int temp;


      if(bmonth==1)
       {
          return bdate;
       }
      else if(bmonth==2)
       {
          temp=jan+bdate;
          return temp;
       }
       else if(bmonth==3)
       {
          temp=jan+feb+bdate;
          return temp;
       }
        else if(bmonth==4)
       {
          temp=jan+feb+march+bdate;
          return temp;
       }
        else if(bmonth==5)
       {
          temp=jan+feb+march+april+bdate;
          return temp;
       }
     else if(bmonth==6)
       {
          temp=jan+feb+march+april+may+bdate;
          return temp;
       }
      else if(bmonth==7)
       {
          temp=jan+feb+march+april+may+june+bdate;
          return temp;
       }
        else if(bmonth==8)
       {
          temp=jan+feb+march+april+may+june+july+bdate;
          return temp;
       }   
        else if(bmonth==9)
       {
          temp=jan+feb+march+april+may+june+july+aug+bdate;
          return temp;
       }   
        else if(bmonth==10)
       {
          temp=jan+feb+march+april+may+june+july+aug+sept+bdate;
          return temp;
       }   
        else if(bmonth==11)
       {
          temp=jan+feb+march+april+may+june+july+aug+sept+oct+bdate;
          return temp;
       }   
        else
       {
          temp=jan+feb+march+april+may+june+july+aug+sept+oct+nov+bdate;
          return temp;
       }
    }
 }
 class Age_Cal
{
  public static void main(String []args)
   { 
     age a= new age();
     a.Age();
     int flag;
     
     
      flag=a.calculateDays();
      System.out.println("your birth date " +flag+ "th day of the year");
     
   }
  
}

