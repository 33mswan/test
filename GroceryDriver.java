// Name : Michael Swanson
// Class : CIST 1400-502
// Colleagues : N/a
// Resources : N/a
import java.util.Scanner;

public class GroceryDriver {
   public static void main(String[] args) {
      Scanner get = new Scanner(System.in);
      GroceryList grocery = new GroceryList();
      System.out.println("1. Print the grocery list");
      System.out.println("2. Print the number of different items on list");
      System.out.println("3. Print the number of grocery items to be purchased");
      System.out.println("4. Add an item");
      System.out.println("5. Remove an item");
      System.out.println("6. Increase the quantity of an item");
      System.out.println("7. Sort the items by quantity");
      System.out.println("8. Sort the items by name");
      System.out.println("9. Quit");
      System.out.print("Enter Choice: ");
      int select = get.nextInt();
      if (select > 0 && select < 9)
      {
         while (select != 9)
         {
            if (select == 1)
            {
               System.out.print("Grocery list is:\n");
               System.out.print(grocery.toString() + "\n");
               System.out.println("1. Print the grocery list");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter Choice: ");
               select = get.nextInt();
            }
            else if (select == 2)
            {
               System.out.println("Number of unique items: " + grocery.getCount() + "\n");
               System.out.println("1. Print the grocery list");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }           
            else if (select == 3)
            {
               int total = 0;
               
               for (int i = 1; i <= grocery.getCount(); i++)
               {
                  total += grocery.getItem(i).getQuantity();
                  
               }
               System.out.println("Total grocery items: " + total + "\n");
               System.out.println("1. Print the grocery list");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }
            else if (select == 4)
            {
               System.out.println("Enter item: ");
               String it = get.nextLine();
               it = get.nextLine();
               System.out.println("Enter quantity (1 -20): ");
               int quant = get.nextInt();
               while (quant < 1 || quant > 20)
               {
                  System.out.println("Enter quantity (1 -20): ");
                  quant = get.nextInt();
               }
               if (grocery.getCount() == 30)
               {
                  System.out.println("No more room");
               } 
               else
               {
                  Item b = new Item(it, quant);
                  grocery.addItem(b);
               }
               System.out.print("\n1. Print the grocery list\n");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }
            else if (select == 5)
            {
               System.out.print("Here is the list of groceries\n");
               System.out.print(grocery.toString() + "\n");
               System.out.println("Enter number of item to delete");
               int del = get.nextInt();
               if (del >= 1 && del <= grocery.getCount())
               {
                  grocery.deleteItem(del);
               }
               else
               {
                  System.out.println("Item does not exist");  
               }
               System.out.println("\n1. Print the grocery list");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }
            else if (select == 6)
            {
               System.out.println("Here is the list of groceries");
               System.out.print(grocery.toString());
               System.out.println("\nEnter number of item for quantity increase");
               int inc = get.nextInt();
               if (inc >= 1 && inc <= grocery.getCount())
               {
                  grocery.getItem(inc).increaseQuant();
               } 
               else
               {
                  System.out.println("Item does not exist\n");
               }
               System.out.println("1. Print the grocery list");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }
            else if (select == 7)
            {
               System.out.print("Groceries Sorted by Quantity: \n");
               Item[] groc = grocery.sortQuant();   
               for (int i = 0; i < grocery.getCount(); i++)
               {
                  System.out.println((i + 1)  + ". " + groc[i]);
               }                  
               System.out.println("\n1. Print the grocery list");
               System.out.println("2. Print the number of differnt items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }
            else if (select == 8) 
            {
               System.out.println("Groceries Sorted by Name");
               Item[] groc = grocery.sortName();   
               for (int i = 0; i < grocery.getCount(); i++)
               {
                  System.out.println((i + 1) + ". " + groc[i]);
               }                  
               System.out.println("\n1. Print the grocery list");
               System.out.println("2. Print the number of different items on list");
               System.out.println("3. Print the number of grocery items to be purchased");
               System.out.println("4. Add an item");
               System.out.println("5. Remove an item");
               System.out.println("6. Increase the quantity of an item");
               System.out.println("7. Sort the items by quantity");
               System.out.println("8. Sort the items by name");
               System.out.println("9. Quit");
               System.out.print("Enter choice: ");
               select = get.nextInt();
            }
            else
            {
               select = 9;
               System.out.println("Thanks for shopping with us.");
            }
         }
      }
      else if (select == 9)
      {
         System.out.println("Thanks for shopping with us.");
      }
   }
} 