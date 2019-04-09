import java.util.ArrayList;

public class RotatorTest
{     
   public static void main(String[] args)
   {
      Rotator fourFour = new Rotator(4);
      Rotator threeFour = new Rotator(3);
      Rotator twoFour = new Rotator(2);
      
      for(int i = 0; i < 12; i++)
      {
         System.out.println("4/4 " + fourFour.onTrigger());
         System.out.println("3/4 " + threeFour.onTrigger());
         System.out.println("2/4 " + twoFour.onTrigger());
      }
   }
}