/**********
 * Name: myla Vijayan
 * Date: 3/13/24
 * Project: Order
 */

import java.util.*;

public class Order 
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter your name: ");
       String Name = input.nextLine();
       System.out.print("");

       System.out.println("Enter the number of burgers: ");
       int Burgers = input.nextInt();

       System.out.println("Enter the number of fries: ");
       int Fries = input.nextInt();

       System.out.println("Enter the number of sodas: ");
       int Sodas = input.nextInt();

       double Cost = (Burgers*1.69) + (Fries*1.09) + (Sodas*0.99);
       System.out.println("Total before tax: " + "$" + Cost);

       double Tax = (0.085 * Cost);
       System.out.println("Tax: " + "$" + Tax);

       double FinalTotal = (Tax + Cost);
       System.out.println("Final Total: " + "$" + FinalTotal);

       System.out.println("Enter the amount tendered: "); 
       double Tender = input.nextDouble(); 

       double Change = (Tender - FinalTotal);
       System.out.println("Change: " + "$" + Change);

       input.close();

   }
}

