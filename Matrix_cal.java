import java.util.Scanner;
class Matrix
 {  
   int arr[][]=new int[2][2];
   int arr1[][]=new int[2][2];


   Scanner sc=new Scanner(System.in);
   
   void mat()
	{
           System.out.println("\n Enter the elements of array:");
              for(int i=0;i<2;i++)
                 {
                        for(int j=0;j<2;j++)
                         {
                              arr[i][j]=sc.nextInt();
                         }
                 }

		System.out.println("\n Enter the elements of array1:");  
              for(int i=0;i<2;i++)
                 {
                        for(int j=0;j<2;j++)
                         {
                              arr1[i][j]=sc.nextInt();
                         }
                 }


	}

   void print()
      {

        System.out.println("Array is");
        for(int i=0;i<2;i++)
             {
                 for(int j=0;j<2;j++)
                   {
                     System.out.print(arr[i][j]+" ");
                   }
                System.out.print("\n");
             }

         System.out.println("Another array is:");
        for(int i=0;i<2;i++)
             {
                 for(int j=0;j<2;j++)
                   {
                     System.out.print(arr1[i][j]+" ");
                   }
                System.out.print("\n");
             }
      }

void Addition()
{
  System.out.println("Addition is");
  for(int i=0;i<2;i++)
    {
          for(int j=0;j<2;j++)
		{
                   int temp=arr[i][j]+arr1[i][j];
                   System.out.print(temp+" ");
		 }
         System.out.print("\n");
     }
  }
void Sub()
{
  System.out.println("Substaction is:");
  for(int i=0;i<2;i++)
    {
          for(int j=0;j<2;j++)
		{
                   int temp=arr[i][j]-arr1[i][j];
                   System.out.print(temp+" ");
		 }
         System.out.print("\n");
     }

}

void Mul()
{
   int mul[][]= new int[2][2];
   System.out.println("Multiplication is:");

   for(int i=0;i<2;i++)
    {
       for(int j=0;j<2;j++){
         mul[i][j]=0;
         for(int k=0;k<2;k++)
           {
             mul[i][j]+=arr[i][k]*arr1[k][j];
          }
          System.out.print(mul[i][j]+" ");
     }
   System.out.print("\n");
 }
 }
}

class Matrix_cal
{
   public static void main(String []args)
     {
        Matrix M=new Matrix();
        M.mat();
	M.print();
        M.Addition();
	M.Sub();
        M.Mul();


     }

}






