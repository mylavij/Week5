/***********
 * Name: Myla Vijayan
 * Date: 3/13/24
 * Project: Taxi 
 */

import java.util.*;

public class Taxi 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of passengers: ");
        int Passengers = input.nextInt();

        int Cabs = (Passengers/4);
        int Remains = (Passengers%4);
        System.out.println(Cabs + " cabs are required");
        System.out.println(Remains + " passenger(s) will be left over");

        input.close();

    }
}
    


