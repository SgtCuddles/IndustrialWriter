import java.util.ArrayList;

public class RotatorTest
{     
   public static void main(String[] args)
   {
      Rotator fourFour = new Rotator(4, true);
      Rotator fourFourRev = new Rotator(4, false);
      Rotator threeFour = new Rotator(3);
      Rotator twoFour = new Rotator(2);
      
      
      
      for(int i = 0; i < 12; i++)
      {
         System.out.print(" " + fourFour.getCount());
         
      }
   }
}