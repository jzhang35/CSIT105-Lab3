// James Zhang
package lab3;
import java.util.Scanner;

public class Lab3
{
   public static void main(String[] args)
   {
      int bunniesLaunched,
          pointsEarned;
      double pointsPerBunny;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many bunnies were launched? ");
      bunniesLaunched = keyboard.nextInt();
      
      System.out.print("How many points were earned? ");
      pointsEarned = keyboard.nextInt();
      
      pointsPerBunny = (double)pointsEarned / bunniesLaunched;
      
      System.out.printf("%s Points for %s bunnies = %,.1f points/bunny\n",
                     pointsEarned, bunniesLaunched, pointsPerBunny);
   }
}