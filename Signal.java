public class Signal
{
   private int count;
   
   public Signal(int count){  this.count = count;  }
   
   public int trigger()
   {
      return(-1);
   }
   
   public void setCount(int val){ count = val;   }
   public int getCount(){  return count;  }
}