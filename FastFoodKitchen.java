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
public class FastFoodKitchen {
    private ArrayList<Order> orderList = new ArrayList<>();
    private static int nextOrderNum = 1;
    
    /**
     * 
     * Adds all orders to the arraylist
     */
    
    public FastFoodKitchen() {
        Order order1 = new Order(3,5,4,10,true, FastFoodKitchen.getNextOrderNum());
        FastFoodKitchen.incrementNextOrderNum();
        Order order2 = new Order(0,0,3,3,false, FastFoodKitchen.getNextOrderNum());
        FastFoodKitchen.incrementNextOrderNum();
        Order order3 = new Order(1,1,0,2,false, FastFoodKitchen.getNextOrderNum());
        FastFoodKitchen.incrementNextOrderNum();
        
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        
    }
    
    /**
     * Keeps track of the next order number, adding 1 each time an order passes
     */
    
    public static void incrementNextOrderNum() {
        nextOrderNum++;
    }
    
    /**
     * gets the order number
     * @return returns the order number
     */
    
    public static int getNextOrderNum() {
        return nextOrderNum;
    }
    
    /**
     * 
     * @param ham hambergers
     * @param cheese cheeseburgers
     * @param veggie veggieburgers
     * @param soda soda
     * @param toGo Is the order to go
     * @return returns order number
     */
    
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo) {
        Order order = new Order (ham, cheese, veggie, soda, toGo, FastFoodKitchen.getNextOrderNum());
        orderList.add(order);
        incrementNextOrderNum();
        return getNextOrderNum();
    }
    
    /**
     * cancels the last order in the array
     * @return returns if the last order was canceled
     */
    
    public boolean cancelLastOrder() {
        if(nextOrderNum != 0) {
            orderList.remove(orderList.size()-1);
            nextOrderNum--;
            return true;
        }
        else
            return false;
    }
    
    /**
     * 
     * @return returns the number of pending orders
     */
    
    public int getNumOrdersPending() {
        return orderList.size();
    }
    
    public boolean isOrderDone(int orderID) {
        for (int i = 0; i < orderList.size(); i++) {
        if (orderList.indexOf(i) == orderID) 
            return false;
    }
        return false;
    }
    
    public boolean cancelOrder(int orderID) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.indexOf(i) == orderID) {
                orderList.remove(i);
                return true;
            }
        }
        return true;
    }
 }
    
    

