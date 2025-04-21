/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * 
 */
import java.util.Scanner;
public class PizzaOrder {
    public static Scanner input=new Scanner(System.in);
    public static int choose,quantity;
    public static float total;
    public static void order(){
        System.out.println("enter your choice please");
    choose=input.nextInt();
    switch (choose){
        case 1:
    System.out.println("##########################################");
    System.out.println("you have choosen large pizza with one cheese,one pepperoni and two ham topping");
    System.out.println("enter amount please");
    quantity=input .nextInt();
    total=quantity*22;
        break;
        case 2:
    System.out.println("##########################################");
    System.out.println("you have choosen large pizza with one cheese,one pepperoni and one ham topping");
   System.out.println("enter amout please");
    quantity=input .nextInt();
    total=quantity*15;
        break;
        case 3:
    System.out.println("##########################################");
    System.out.println("you have choosen large pizza with two cheese,one pepperoni and two ham topping");
   System.out.println("enter amout please");
    quantity=input .nextInt();
    total=quantity*25;
       break;
        case 4:
    System.out.println("##########################################");
     System.out.println("you have choosen large pizza with one cheese,one pepperoni and two ham topping");
    System.out.println("enter amout please");
    quantity=input .nextInt();
    total=quantity*12;
        break;
        default:
            System.out.println("please enter an appropriate choice");
    System.out.println("***************************************");
       order();
       }
   }
     public static void calcTotal(float x){
        System.out.println("total price=$ "+x);
        
    }
   
    
}

