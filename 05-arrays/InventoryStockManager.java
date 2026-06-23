/*
Question 2: Inventory Stock Manager
Create a Java program that manages inventory stock quantities using an array.

The program should:
- Store the stock quantities of multiple products in an array.
- Calculate the total stock available.
- Identify products with low stock levels.
- Display inventory information in a clear and organized format.
 */
public class InventoryStockManager {
    public static void main(String[] args) {
        String[] products={"Laptop","Monitor","Keyboard","Mouse","Speaker"};
        int[] quantities={4,18,32,29,1};

        int total=0;
        System.out.println("Stocks Lower than 20");
        for(int i=0;i<quantities.length;i++){
            total=(total+quantities[i]);

                if(quantities[i]<20){
                System.out.println(products[i]+"="+quantities[i]);
            }
        }
        System.out.println("Total Available Stock: "+total);
        System.out.println("Inventory Information");
        System.out.println("---------------------");

        for(int j=0;j<quantities.length;j++){
            System.out.println(products[j]+"="+quantities[j]);
        }


    }

}
