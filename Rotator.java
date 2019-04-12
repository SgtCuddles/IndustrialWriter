import java.util.ArrayList;

public class Rotator extends Signal
{
   private int arms;
   
   private boolean forwards;
   
   public Rotator(int arms, boolean forwards)
   {
      super(0);
      this.arms = arms - 1;
      this.forwards = forwards;
      if(!forwards)
      {
         setCount(arms - 1);
      }
   }
   
   public Rotator(int arms){  this(arms, true); }
   
   public int onTrigger()
   {
      int tmp = getCount();
      if(getCount() < arms && forwards)
      {
         setCount(getCount() + 1);
      }
      else if(forwards)
      {
         setCount(0);
      }
      
      if(getCount() > 0 && !(forwards))
      {
         setCount(getCount() - 1);
      }
      else if(!(forwards))
      {
         setCount(arms);
      }
      
      return tmp;
   }
   
   public void setArms(int val){ arms = val; }
   public void setForwards(boolean val){  forwards = val;   }
   
   public int getArms(){   return arms;   }
   public boolean getForwards(){  return forwards;  }
}