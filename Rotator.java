import java.util.ArrayList;

public class Rotator
{
   private int arms;
   private int position;
   
   private boolean forwards;

   public Rotator(int arms)
   {
      this.arms = arms - 1;
      position = 0;
      forwards = true;
   }
   
   public Rotator(int arms, boolean forwards)
   {
      this(arms);
      this.forwards = forwards;
      if(!forwards)
      {
         position = this.arms;
      }
   }
   
   public int onTrigger()
   {
      int tmp = position;
      if(position < arms && forwards)
      {
         position++;
      }
      else if(forwards)
      {
         position = 0;
      }
      
      if(position > 0 && !(forwards))
      {
         position-=1;
      }
      else if(!(forwards))
      {
         position = arms;
      }
      
      return tmp;
   }
   
   public void setArms(int val){ arms = val; }
   public void setPosition(int val){ position = val;   }
   public void setForwards(boolean val){  forwards = val;   }
   
   public int getArms(){   return arms;   }
   public int getPosition(){  return position;  }
   public boolean getForwards(){  return forwards;  }
}