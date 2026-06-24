/*
Question 1: Library Book System
Create a Java program that models a library book using a class.

The program should:
- Create a class named `Book`.
- Store information about a book, including its title, author, and price.
- Create one or more book objects.
- Assign values to the object's attributes.
- Display the details of each book in a readable format.
 */

    class Book{
        String title;
        String author;
        double price;
    }

     public class LibraryBookSystem {
    public static void main(String[] args) {
        
        Book book1 = new Book();

        book1.title="Gamperaliya";
        book1.author="Martin Wickramasinghe";
        book1.price=750.00;

        Book book2 = new Book();

        book2.title="Hathpana";
        book2.author="Kumarathunga Munidasa";
        book2.price=500.00;

        System.out.println("Book Title: "+book1.title);
        System.out.println("Book Author: "+book1.author);
        System.out.println("Book Price: "+book1.price);
        System.out.println("----------------------");
        System.out.println("Book Title: "+book2.title);
        System.out.println("Book Author: "+book2.author);
        System.out.println("Book Price: "+book2.price);



    }
}
