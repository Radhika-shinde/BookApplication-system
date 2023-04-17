package bookApplication;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		BookService bservice=new BookService();
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Welcome to book management system");
			System.out.println("press:\n1) to create  book\n "
			+"2)to get all book details\n"+"3) to get book details using id\n"+
					"4)to get book details using name\n"+"5) to exit");
			System.out.println("=========================");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				bservice.createBook();
				System.out.println();
				break;
				
			case 2:
				bservice.getAllBookDetails();
				System.out.println();
				break;
				
			case 3:	
				bservice.getBookDetailsById();
				System.out.println();
				break;
				
			case 4:	
				bservice.getBookDetailsByName();
				System.out.println();
				break;	
				
			case 5:
				System.exit(0);
				System.out.println("exit.");
				break;
			}
		}
		while(true);

	}

}
