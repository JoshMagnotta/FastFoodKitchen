/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FastFoodKitchen;

import java.util.*;

/**
 *
 * @author jmhee
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FastFoodKitchen kitchen = new FastFoodKitchen();
        Scanner sc = new Scanner(System.in);

        while (kitchen.getNumOrdersPending() != 0) {
            // see what the user wants to do
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order food");
            System.out.println("\t 2. Cancel last order");
            System.out.println("\t 3. Show number of orders currently pending.");
            System.out.println("\t 4. Cancel your order");
            System.out.println("\t 5. Show if you order is done");
            System.out.println("\t 6. Exit");

            int num = sc.nextInt();
            switch (num) {

                case 1:
                    System.out.println("How many hamburgers do you want?");
                    int ham = sc.nextInt();
                    System.out.println("How many cheeseburgers do you want?");
                    int cheese = sc.nextInt();
                    System.out.println("How many veggieburgers do you want?");
                    int veggie = sc.nextInt();
                    System.out.println("How many sodas do you want?");
                    int sodas = sc.nextInt();
                    System.out.println("Is your order to go? (Y/N)");
                    char letter = sc.next().charAt(0);
                    boolean TOGO = false;
                    if (letter == 'Y' || letter == 'y') {
                        TOGO = true;
                    }
                    int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                    System.out.println("Thank-you. Your order number is " + orderNum);
                    System.out.println();
                    break;
                case 2:
                    boolean ready = kitchen.cancelLastOrder();
                    if (ready) {
                        System.out.println("Thank you. The last order has been canceled");
                    } else {
                        System.out.println("Sorry. There are no orders to cancel.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
                    break;
                case 4:
                    System.out.println("What is your order number?");
                    int input = sc.nextInt();
                    if (kitchen.cancelOrder(input) == true)
                        System.out.println("Your order has been cancelled");
                    else
                        System.out.println("Sorry, we could not find your order");
                    break;
                case 5:
                    System.out.println("What is your order number");
                    input = sc.nextInt();
                    if (kitchen.isOrderDone(input) == false)
                        System.out.println("Your order is being prepared");
                    else
                        System.out.println("No order was found");
                    break;
                case 6:
                    System.out.println("Thank you.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Sorry, please input one of the options above.");

            }

        }

    }

}
