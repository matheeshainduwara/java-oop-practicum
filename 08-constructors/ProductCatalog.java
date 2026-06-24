/*
Question 1: Product Catalog

Create a Java program that manages product information using constructors.

The program should:
- Create a class named `Product`.
- Store information such as product name, price, and quantity.
- Initialize product objects using constructors instead of assigning values individually.
- Create multiple product objects and display their details.
 */

class Product{
    String name;
    double price;
    int quantity;

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}


public class ProductCatalog {
    public static void main(String[] args) {
        
        Product product1=new Product("Mouse", 500, 20);
        Product product2=new Product("Keyboard",2500 , 8);
        Product product3=new Product("Monitor", 6500, 10);

        System.out.println("------------------------------------");
        System.out.println("Product Name: "+product1.name);
        System.out.println("Product Price: "+product1.price);
        System.out.println("Product Quantity: "+product1.quantity);
        System.out.println("------------------------------------");
        System.out.println("Product Name: "+product2.name);
        System.out.println("Product Price: "+product2.price);
        System.out.println("Product Quantity: "+product2.quantity);
        System.out.println("------------------------------------");
        System.out.println("Product Name: "+product3.name);
        System.out.println("Product Price: "+product3.price);
        System.out.println("Product Quantity: "+product3.quantity);
        System.out.println("------------------------------------");
    }
}
