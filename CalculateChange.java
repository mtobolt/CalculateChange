package calculatechange;

/*
* File name: CalculateChange.java
*
* Programmer: Matt Tobolt
* ULID: mtobolt
*
* Date: Oct 6, 2014
*
* Class: IT 168
* Lecture Section: 01
* Lecture Instructor: Matsuda
* Lab Section: 03
* Lab Instructor: Karl Bissereth
*/
import java.util.Scanner;
/**
  * <insert class description here>
  *
  * @author Matt Tobolt
  *
  */
public class CalculateChange
{
        public static void main(String[] args)
        {
                int quarters;
                int dimes;
                int nickels;
                int remainder;
                boolean valid = true;
                int price;
                Scanner kb = new Scanner(System.in);
                System.out.println("Item price must be 25-cents to a dollar, in 5-cent increments.");
                System.out.print("Enter item price: ");
                price = kb.nextInt();

                if(price<25)
                {
                        valid = false;
                        System.out.println("Cost is invalid. Must be at least 25-cents.");
                }
                else if(price>100)
                {
                        valid = false;
                        System.out.println("Cost is invalid. Must be less than 100-cents.");
                }
                if(price%5 != 0)
                {
                        valid = false;
                        System.out.println("Cost is invalid. Must be evenly divisible by 5.");
                }
                if(valid)
                {
                        int originalPrice = price;
                        originalPrice = 100-price;
                        quarters = price/25;
                        price = price%25;
                        originalPrice = (price-quarters);
                        dimes = price/10;
                        price = price%10;
                        originalPrice = (price-dimes);
                        nickels = price/5;
                if(quarters != 0)
                {
                        if(quarters == 1)
                        {
                                System.out.println(quarters + " quarter.");
                        }
                        else
                        {
                                System.out.println(quarters + " quarters.");
                        }
                }
                if(dimes != 0)
                {
                        if(dimes == 1)
                        {
                                System.out.println(dimes + " dime.");
                        }
                        else
                        {
                                System.out.println(dimes + " dimes.");
                        }
                }
                if(nickels != 0)
                {
                        if(nickels == 1)
                        {
                                System.out.println(nickels + " nickel.");
                        }
                        else
                        {
                                System.out.println(nickels + " nickels.");
                        }
                }
                kb.close();
        }
   }
}
