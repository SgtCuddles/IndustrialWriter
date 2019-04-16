import java.util.ArrayList;
import java.util.Scanner;

public class ManagerTest
{
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ArrayList<Signal> rotators = new  ArrayList<Signal>();
      
      System.out.print("Add rotators? : ");
      while(input.nextBoolean())
      {
         System.out.print("Count of rotator : ");
         rotators.add(new Rotator(input.nextInt()));
         System.out.print("Continue? : ");
      }
      MachineManager manager = new MachineManager(rotators);
      
      System.out.print("Num of measures : ");
      int duration = input.nextInt();
      
      input.close();
      
      for(int i = 0; i < duration; i++)
      {
         rotators = manager.getSignals();
         System.out.print("| ");
            for(int j = 0; j < rotators.size(); j++)
            {
               System.out.print(rotators.get(j).trigger() + " ");
            }
         System.out.print(" ");
      }
   }
   
}