import java.util.ArrayList;

public class Rotator
{
   public int arms;
   public int position;

   public Rotator(int arms){
      this.arms = arms - 1;
      position = 0;
   }
   
   public int onTrigger()
   {
      int tmp = position;
      if(position < arms)
      {
         position++;
      }
      else
      {
         position = 0;
      }
      return tmp;
   }
   
   public void setArms(int val){ arms = val; }
   public void setPositon(int val){ position = val;   }
   
   public int getArms(){   return arms;   }
   public int getPosition(){  return position;  }
}