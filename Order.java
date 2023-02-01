/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FastFoodKitchen;

/**
 *
 * @author jmhee
 */

public class Order {
   private int numHambergers = 0;
   private int numCheeseburgers = 0;
   private int numVeggieburgers = 0;
   private int numSodas = 0;
   private boolean orderToGo = false;
   private int orderNum = 1;
   
   public Order(int hambergers, int cheeseburgers, int veggieburgers, int sodas, boolean orderTakeout, int nextOrderNum) {
       this.numHambergers = hambergers;
       this.numCheeseburgers = cheeseburgers;
       this.numVeggieburgers = veggieburgers;
       this.numSodas = sodas;
       this.orderToGo = orderTakeout;
       this.orderNum = nextOrderNum;
       
       
   }
   
   public void setHambergers(int num) {
       if (num >= 0)
        numHambergers = num;
       else
           System.out.println("Error: You can not have negative hambergers.");
   }
   
   public int getHambergers() {
       return numHambergers;
   }
   
    public void setCheesebergers(int num) {
      if (num >= 0)
       numCheeseburgers = num;
      else
       System.out.println("Error: You can not have negative cheeseburgers.");  
   }
   
   public int getCheeseburgers() {
       return numCheeseburgers;
   }
   
   public void setVeggieburgers(int num) {
      if (num >= 0)
       numVeggieburgers = num;
      else
       System.out.println("Error: You can not have negative Veggieburgers.");  
   }
   
   public int getVeggiebuegers() {
       return numVeggieburgers;
   }
   
   public void setSodas(int num) {
      if (num >= 0)
       numSodas = num;
      else
       System.out.println("Error: You can not have negative sodas.");  
   }
   
   public int getSodas() {
       return numSodas;
   }
   
   public void setOrderToGo(boolean input) {
       orderToGo = input;
   }
   
   public boolean isOrderToGo() {
       return orderToGo;
   }
   
   public void setOrderNum(int num) {
       orderNum = num;
   }
   
   public int getOrderNum() {
       return orderNum;
   }
   

   
   
   
   
   
   
   
}


