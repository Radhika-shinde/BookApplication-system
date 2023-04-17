package bookApplication;

import java.util.Scanner;

public class BookService {
	
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook()
	{
		System.out.println("enter book id:");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter book name:");
		String bname=sc.nextLine();
		
		System.out.println("enter book price");
		double price=sc.nextDouble();
		
		book[index]=new Book(id,bname,price);
		index++;
		System.out.println("book details created successfully");
	}
	
	//get all book details method
	public static void getAllBookDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book Id:"+book[i].getBookId());
			System.out.println("Book Name:"+book[i].getBookName());
			System.out.println("Book price:"+book[i].getBookPrice());
			System.out.println("========================");
		}
			
		
	}
	
	//get book details based on id
	public static void getBookDetailsById()
	{
		System.out.println("enter id to search:");
		boolean flag=false;
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId()==id)
			{
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book price:"+book[i].getBookPrice());
				System.out.println("========================");
				flag=true;
				break;
			}
			else
			{
				if(flag==false)
					System.out.println("book not found!");
			}
		}
		}
	//get a book details based on name
	public static void getBookDetailsByName()
	{
		System.out.println("enter Name to search:");
		boolean flag=false;
		sc.nextLine();
		String name=sc.nextLine();
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookName().equalsIgnoreCase(name))
			{
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book price:"+book[i].getBookPrice());
				System.out.println("========================");
				flag=true;
				break;
			}
			
		}
		
		{
			if(flag==false)
				System.out.println("book not found!");
		}
		
		
	}
	

}
