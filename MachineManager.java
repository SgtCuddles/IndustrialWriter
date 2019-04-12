import java.util.ArrayList;

public class MachineManager
{
   private ArrayList<Signal> signals;
   private ArrayList<Machine> machines;
   public int[] activeRState;
   
   public MachineManager(ArrayList<Signal> signals)
   {
      this.signals = signals;
      activeRState = new int[signals.size()];
   }
   
   public ArrayList<Signal> getSignals(){ return signals;   }
   public void setSignals(ArrayList<Signal> signals){ this.signals = signals;  }
   
   public int[] getActiveRState(){  return activeRState; }
   public void setActiveRState(int[] arr){   activeRState = arr;  }
}