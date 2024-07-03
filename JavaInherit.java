import java.util.Scanner;
class Book
{
    String title;
    String author;  
    int numberOfPages;
    String ISBN;
    
    Book(String tit,String aut,int num,String isbn) 
    {
     title = tit; 
     author = aut;
     numberOfPages = num;
     ISBN = isbn;
    }
    Book(String tit,String aut,int num) 
    {
     title = tit; 
     author = aut;
     numberOfPages = num;
    }
    public String getInitials() 
    {
     String initials =".";
     for(int i = 1;i < author.length();i++) 
     {
        char currentChar = author.charAt(i);
        if (currentChar ==' ')
         {
         int flag=i+1;
        initials = initials+author.charAt(flag)+'.';
         }
     }
    initials=author.charAt(0)+initials;
    return initials;
   }
}
class ScientificBook extends Book        
{
    String area;
    boolean proceeding = false;
    ScientificBook(String tit,String aut,int num,String isbn,String a) 
    {
    super(tit,aut,num,isbn);
    area = a;
    }    
   public void DisplayBookInformation()
    {
        System.out.println("*******Book Information***********");
        System.out.println("Title of theBook:"+title);
	System.out.println("Author of theBook:"+author);
	System.out.println("Number of pages in the Book:"+numberOfPages);
	System.out.println("ISBN number  of the Book:"+ISBN);
	System.out.println("Area of the Book:"+area);
	System.out.println("Whether this is from proceedings:"+proceeding); 
    }
}

class NovelBook extends Book
{

  String type;
  int price;
  String area;
  
  NovelBook(String tit,String aut,int num,String isbn,String a,String t,int p)
    {
      super(tit,aut,num,isbn);
      type=t;
      price=p;
      
    }  
    public void Display()
     {
        
        System.out.println("*******Book Information***********");
        System.out.println("Title of theBook:"+title);
	System.out.println("Author of theBook:"+author);
	System.out.println("Number of pages in the  Book:"+numberOfPages);
	System.out.println("ISBN number  of the Book:"+ISBN);
        System.out.println("Type of book:"+type);
        System.out.println("Price of the book:"+price); 
       
    }
}
class CommicBook extends Book
{

  String color;
  String area;

  
  CommicBook(String tit,String aut,int num,String a,String c )
    {
      super(tit,aut,num);
      color=c;
      
    }  
    public void DisplayCommic()
     {
        
        System.out.println("*******Book Information***********");
        System.out.println("Title of theBook:"+title);
	System.out.println("Author of theBook:"+author);
	System.out.println("Number of pages in the  Book:"+numberOfPages);
	System.out.println("Area of the Book:"+area);
        System.out.println("Background colour of book:"+color);
        
       
    }
}





class JavaInherit {

    public static void main(String[] args)
    {  
        String title,author,area,proceeding,type;
        int numberofPages,ch=0,price;
        String ISBN;
        String color;
        Scanner sc=new Scanner(System.in);
               System.out.println("\nEnter the title of book:");
               title=sc.nextLine();
  
       	       System.out.println("\nEnter the name of author:");
               author=sc.nextLine();

               System.out.println("\nEnter the number of pages:");
               numberofPages=sc.nextInt();

               System.out.println("\nEnter the ISBN:");
               ISBN=sc.next();
  
               System.out.println("\nEnter the area:");
               area=sc.next();
        ScientificBook b1=new ScientificBook(title,author,numberofPages,ISBN,area);
        while(ch<3)
        {
        System.out.println("\n1)Scientific book \n2)Novel book \n3)Comic \n4)Exit");
        ch=sc.nextInt();

     switch(ch)
    {
        case 1:System.out.println("Program for Inheritance!");
               System.out.println("Initials: "+ b1.getInitials());
               b1.DisplayBookInformation();
               break;
      
        case 2:System.out.println("\n Enter the type:");
               type=sc.next();
     
               System.out.println("\n Enter the price:");
               price=sc.nextInt();
               NovelBook b2=new NovelBook(title,author,numberofPages,ISBN,area,type,price);
 	       b2.Display();
               break;


       case 3:System.out.println("\n Enter the background colour of book");
	       color=sc.next();
               CommicBook C=new CommicBook(title,author,numberofPages,area,color);
               C.DisplayCommic();
               break;
          

       case 4:System.exit(0);
              break;

       default:System.out.println("\n Enter the correct choice");
      }
       } 
    }
}