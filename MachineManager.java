import java.util.ArrayList;

public class MachineManager
{
   private ArrayList<Rotator> rotators;
   public int[] activeRState;
   
   public MachineManager(ArrayList<Rotator> rotators)
   {
      this.rotators = rotators;
      activeRState = new int[rotators.size];
   }
   
   public ArrayList<Rotator> getRotators(){ return rotators;   }
   public void setRotators(ArrayList<Rotator> rotators){ this.rotators = rotators;  }
   
   public int[] getActiveRState(){  return activeRState; }
   public void setActiveRState(int[] arr){   activeRState = arr;  }
}