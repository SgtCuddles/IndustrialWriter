import java.util.ArrayList;

public class Rotator extends Machine
{
   private int arms;
   private int count;
   private Machine target;
   
   private boolean forwards;
   
   
   public Rotator(int arms, boolean forwards)
   {
      super(arms + " Arm Rotator");
      count = 0;
      this.arms = arms - 1;
      this.forwards = forwards;
      if(!forwards)
      {
         setCount(arms - 1);
      }
   }
   
   public Rotator(int arms){  this(arms, true); }
   
   public void trigger()
   {
      if(count < arms && forwards)
      {
         count++;
      }
      else if(forwards)
      {
         count = 0;
      }
      
      if(count > 0 && !(forwards))
      {
         count--;
      }
      else if(!(forwards))
      {
         count = arms;
      }
   }
   
   public void setArms(int val){ arms = val; }
   public void setForwards(boolean val){  forwards = val;   }
   public void setCount(int val){ count = val;   }
   public void setTarget(Machine target){ this.target = target;   }
   
   public int getCount(){  return count;  }
   public int getArms(){   return arms;   }
   public boolean getForwards(){  return forwards;  }
   public Machine getTarget(){   return target; };
}