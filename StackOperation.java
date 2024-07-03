import java.util.Scanner;
interface Stack
{
	void push(int ele);
	int pop();
	int peek();
	void display();
}
class Stackoperation implements Stack
{ 

	int []arr;
	int top;
	int maxsize;

	public Stackoperation(int maxsize)
	{
		this.maxsize=maxsize;
		this.arr=new int[maxsize];
		this.top=-1;
	}
	public void push(int ele)
	{
		if(top==maxsize-1)
		{	
			System.out.println("Stack Overflow! Cannot push element.");
            	return;
		}
		arr[++top]=ele;
		System.out.println("\nPUSHED DATA SUCCESSFULY>>>>");	
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow! Cannot pop element.");
            	return -1;
		}

		return arr[top--];
		
	}

	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
            	return -1;
		}
		return arr[top];
	}

	public void display()
	{
		if(top==-1)
		{
			System.out.println("\nstack is Empty");
			return;
		}
		System.out.println("Stack elements:");
        	for (int i = top; i >= 0; i--)
		 {
           		 System.out.println(arr[i]);
       	 }
		
	}
}
class StackOperation
{

    public static void main(String[]args)
    {	
		Scanner sc=new Scanner(System.in);
		int ele;
		int ch;
	 	int maxsize; 
		System.out.print("Enter the maximum size of the stack: ");
		maxsize = sc.nextInt();

		Stack S=new Stackoperation(maxsize);
		
	
	while(true)
	{
		System.out.println("\n1)Push\n2)Pop\n3)Peek\n4)Display\n5)Exit\nEnter your choice :");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			System.out.println("\nEnter the push data :");
			ele=sc.nextInt();
			S.push(ele);
			break;

			case 2:
			int poppedvalue=S.pop();
			if(poppedvalue!=-1)
			{
				System.out.println("\n*-------Popped data successfully-----*");
				System.out.println("\nPoped data is:"+poppedvalue);
			}
			break;

			case 3:
			int topvalue=S.peek();
			if(topvalue!=-1)
			{
				System.out.println("\nPeeked data is:"+topvalue);
			}
			break;

			case 4:
			S.display();
			break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("\nPlease enter the correct choice");			
		}
	}

  }


}