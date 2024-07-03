import java.util.Scanner;
interface Queue
{
	void enqueue(int ele);
	int dequeue();
	int peek();
	void display();
}
class Queueop implements Queue
{
	int []arr;
	int front,rear;
	int maxsize;

	public Queueop(int maxsize)
	{
		this.maxsize=maxsize;
		this.arr=new int[maxsize];
		this.front=-1;
		this.rear=-1;
	}
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

	public int peek()
	{
		if(front==-1 && rear==-1)
		 {
            	System.out.println("QUEUE IS EMPTY>>>");
            	return -1;
       	 }

        	return arr[front];
	}

	public void display() 
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
class QueueOpration
{
	public static void main(String[]args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the maximum size of the stack: ");
		int maxsize = sc.nextInt();

		Queue Q=new Queueop(maxsize);
		while(true)
		{
			System.out.println("\n1)ENQUEUE\n2)DEQUEUE\n3)PEEK\n4)DISPLAY\n5)EXIT\nEnter your choice :");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("\nEnter the enqueue Data :");
					int ele=sc.nextInt();
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
					int peekvalue = Q.peek();
                   		if (peekvalue != -1) 
					{
                        		System.out.println("Front value: " + peekvalue);
                    		}
                   		break;
				case 4:
					Q.display();
					break;
	
				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("\nYOUR CHOICE IS WRONG PLEASE CHOSE THE CORRECT CHOICE>>>>");
			}
		}
	
	}

}