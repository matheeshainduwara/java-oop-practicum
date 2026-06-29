/*
Question 2: Product Inventory Manager

Create a Java program that manages a product inventory using an ArrayList.

The program should:
- Create an `ArrayList<String>` to store product names.
- Add multiple product names to the inventory.
- Display all available products.
- Search for a product using the `contains()` method.
- Remove a product from the inventory using the `remove()` method.
- Display the updated inventory after removing a product.
- Display the total number of products using the `size()` method.
- Check whether the inventory is empty using the `isEmpty()` method.
 */

import java.util.ArrayList;

public class ProductInventoryManagement {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        products.add("Book");
        products.add("Pen");
        products.add("Shoes");
        products.add("School Bag");

        for(String product:products){
            System.out.println(product);
        }

        System.out.println("-------------------------");
        System.out.println("Is pen available in the list: "+products.contains("Pen"));

        System.out.println("-------------------------");
        System.out.println("Removed product:"+products.remove(2));
        System.out.println("Updated inventory after removing product");
         for(String product:products){
            System.out.println(product);
        }
        
         System.out.println("-------------------------");
        System.out.println("Total number of products: "+products.size());
        System.out.println("Is the inventory empty:"+products.isEmpty());

        
    }
}
