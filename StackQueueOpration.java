import java.util.Scanner;
interface Stack
{
	void push(int ele);
	int pop();
	int peek1();
	void display1();
}
interface Queue
{
	void enqueue(int ele);
	int dequeue();
	int peek2();
	void display2();
}
class StackQueueop implements Stack,Queue
{
	int []arr;
	int top;
	int maxsize;
	//int []arr;
	int front,rear;
	//int maxsize;

//Stack

	public StackQueueop(int maxsize)
	{
		//Stack

		this.maxsize=maxsize;

		this.arr=new int[maxsize];
		this.top=-1;
		//queue

		this.arr=new int[maxsize];
		this.front=-1;
		this.rear=-1;
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

	public int peek1()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
            	return -1;
		}
		return arr[top];
	}

	public void display1()
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
//Queue
	public void enqueue(int ele)
	{
		if(rear==maxsize-1)
		{
			System.out.println("Queue is full. Cannot enqueue element.");
            	return;
		}
		if (front==-1 && rear==-1)
	      {
            	front = 0;
        	}
		arr[++rear]=ele;
		System.out.println("\nENQUEUE DATA SUCCESSFULY>>>>");
	}

	public int dequeue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty. Cannot dequeue element.");
            	return -1;
		}

		int dequeuedValue = arr[front];
		
		if (front == rear)
		 {
            	front = rear = -1;
        	 } 
		else
		 {
            	front++;
        	}

	return dequeuedValue;	

	}

	public int peek2()
	{
		if(front==-1 && rear==-1)
		 {
            	System.out.println("QUEUE IS EMPTY>>>");
            	return -1;
       	 }

        	return arr[front];
	}

	public void display2() 
	{
       	   if (front==-1 && rear==-1) 
	   {
            System.out.println("QUEUE IS EMPTY>>>");
            return;
            }
           System.out.println("Queue elements:");
          for (int i = front; i <= rear; i++)
	  {
            System.out.println(arr[i]);
           }
	}

}
class StackQueueOpration
{
	public static void main(String[]args)
    {	
		Scanner sc=new Scanner(System.in);
		int ele;
		int che;
		int ch;
	 	int maxsize; 
		System.out.print("Enter the maximum size of the stack and queue: ");
		maxsize = sc.nextInt();

		Stack S=new StackQueueop(maxsize);
		Queue Q=new StackQueueop(maxsize);
		
		while(true)
		{
			System.out.println("1.Stack\n2.Queue\n3.Exit\nEnetr the coise..");
			che=sc.nextInt();

			switch(che)
			{
				case 1:
					while(true)
					{
						System.out.println("\n1)PUSH\n2)POP\n3)PEEK\n4)DISPLAY\n5)EXIT\nEnter your choice :");
						ch=sc.nextInt();
						switch(ch)
						{
							case 1:
							System.out.println("\nENTER THE PUSHED DADA :");
							ele=sc.nextInt();
							S.push(ele);
							break;

							case 2:
							int poppedvalue=S.pop();
							if(poppedvalue!=-1)
							{
								System.out.println("\nPOPED DATA SUCCESSFULLY>>>");
								System.out.println("\nPOPED DATA IS :"+poppedvalue);
							}
							break;

							case 3:
							int topvalue=S.peek1();
							if(topvalue!=-1)
							{
								System.out.println("\nPEEKED DATA IS :"+topvalue);
							}
							break;
		
							case 4:
							S.display1();
							break;

							case 5:
							System.exit(0);
							break;

							default:
							System.out.println("\nPLEASE ENTER THE CORRECT CHOICE>>>>");	

						}
					}

					

				case 2: 
					while(true)
					{			
						System.out.println("\n1)ENQUEUE\n2)DEQUEUE\n3)PEEK\n4)DISPLAY\n5)EXIT\nEnter your choice :");
						ch=sc.nextInt();
						switch(ch)
						{
							
							case 1:
							System.out.println("\nEnter the enqueue Data :");
							ele=sc.nextInt();
							Q.enqueue(ele);
							break;
	
							case 2:
							int dedata=Q.dequeue();
							if(dedata!=-1)
							{		
								System.out.println("\nDEQUEUED DATA SUCCESSFULY>>>");
								System.out.println("\nDqueued Data is :"+dedata);
							}
							break;
			
							case 3:
							int peekvalue = Q.peek2();
                   						if (peekvalue != -1) 
							{
                        					System.out.println("Front value: " + peekvalue);
                    						}
                   						break;
			
							case 4:
							Q.display2();
							break;
	
							case 5:
							System.exit(0);
							break;

							default:
							System.out.println("\nYOUR CHOICE IS WRONG PLEASE CHOSE THE CORRECT CHOICE>>>>");

						}

					}

					//break;

				case 3:
					System.exit(0);
					break;

				default:
					System.out.println("\nPlease Enter the correct choise>>>>");
			}

		}		

	}
}