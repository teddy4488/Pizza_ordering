
package pizza;




public class Main extends PizzaOrder {

   

    
    public static int again;
    public static float total;
    public  void pizzaDescription(){
    System.out.println("**************************PIZZA ORDERING SYSTEM**************************************");   
    System.out.println("****1,large pizza with one cheese, one pepperoni and two ham topping- price $22.*****");
    System.out.println("****2, large pizza with one cheese, one pepperoni and one ham topping- price $15.*****");
    System.out.println("****3, large pizza with two cheese, one pepperoni and two ham topping- price $25.*****");
    System.out.println("****4, small pizza with one cheese, one pepperoni and one ham topping- price $12.*****");
    System.out.println("*************************************************************************************");}
   
    
public static void main(String args[]){
        Main p=new Main();
               p.pizzaDescription();
               
for (int i=0;i<3;i++){
  PizzaOrder pi=new PizzaOrder();
    pi.order();

    System.out.println("##################################");
    if (i!=2)
    {System.out.println("if you are done ordering press 0\nif you want to continue ordering press any other number");
    again=input.nextInt();
  }
      total=total+pi.total;
if (again==0){
        
   calcTotal( total);                                       
        System.exit(0);                                     
    }                                                               
if (i==2)
    calcTotal(total);
            
                    
                               }
                 }
}

