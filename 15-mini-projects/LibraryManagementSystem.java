/*
Project 2: Library Management System

Develop a console-based Java application that manages library books.

The system should allow users to:
- Add new books.
- Borrow available books.
- Return borrowed books.
- View all books and their availability status.

Each book should contain information such as book ID, title, author, and availability status.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    int id;
    String title;
    String author;
    boolean availability=true;

    public Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        ArrayList<Book> books=new ArrayList<>();
        
        while (true) {
            System.out.println("1-Add new books.");
            System.out.println("2-Borrow available books.");
            System.out.println("3-Return borrowed books.");
            System.out.println("4-View all books and availability.");
            System.out.println("5-Exit Program.");
            System.out.println("Select your choice: ");
            System.out.println("---------------------");

            Scanner scanner=new Scanner(System.in);
            int choice=scanner.nextInt();
            System.out.println("---------------------");

            switch (choice) {
                case 1:
                    System.out.println("Enter Book's Id: ");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Book's Title: ");
                    String title=scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter Book's Author: ");
                    String author=scanner.next();
                    scanner.nextLine();

                    Book book=new Book(id, title, author);
                    books.add(book);
                    System.out.println("Book added successfully.");
                    System.out.println("---------------------");
                    break;
                
                case 2:
                    boolean searchFound=false;
                    System.out.println("Enter book id: ");
                    int searchId=scanner.nextInt();
                    System.out.println("---------------------");
                    for(Book b : books){
                        if(b.id==searchId){
                            if(!b.availability){
                                System.out.println(b.title+" is already borrowed.");
                                System.out.println("---------------------");
                                searchFound = true;
                                break;
                            }
                            else{
                                b.availability=false;
                                System.out.println(b.title+" Borrowed Successfully.");
                                System.out.println("---------------------");
                                searchFound=true;
                                break;
                            }
                        }
                    }
    
                    if (!searchFound) {
                        System.out.println("Book not found");
                        System.out.println("---------------------");
                    }
                    break;

                case 3:
                    boolean returnFound=false;
                    System.out.println("Enter book id: ");
                    int returnId=scanner.nextInt();
                    System.out.println("---------------------");
                    for(Book b : books){
                        if(b.id==returnId){
                            if(b.availability){
                                System.out.println(b.title+" is already returned.");
                                System.out.println("---------------------");
                                returnFound= true;
                                break;
                            }
                            else{
                                b.availability=true;
                                System.out.println(b.title+" Returned Successfully.");
                                System.out.println("---------------------");
                                returnFound=true;
                                break;
                            }
                        }
                    }
    
                    if (!returnFound) {
                        System.out.println("Book not found");
                        System.out.println("---------------------");
                    }
                    break;

                case 4:
                    if(books.isEmpty()){
                        System.out.println("No Books Available");
                        System.out.println("---------------------");
                    }
                    else{
                        for(Book b:books){
                            System.out.println("ID:"+b.id);
                            System.out.println("Title: "+b.title);
                            System.out.println("Author: "+b.author);
                            System.out.println("Availability: "+b.availability);
                            System.out.println("---------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You");
                    System.out.println("---------------------");
                    return;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println("---------------------");
                    break;
            }
        }
    }
}
