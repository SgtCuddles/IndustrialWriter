import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.util.ArrayList;

public class IndustrialWriter(){
   private ArrayList<String> voices =  new ArrayList{"V0", "V1", "V2", "V3", "V4","V5", "V6", 
                                       "V7", "V8", "V9", "V10", "V11", "V12", "V13", "V14", "V15"};
   
   //place main machine of each branch (up to 16 machines) into the array Mainline
   private ArrayList<Machine> mainline = new ArrayList<>();
   
   public static void main(String[] args)
   {
      for(int i = 0; i < voices.size; i++)
      {
         String currentTrack = voices.get(i);
         Machine branchMaster = mainline.get(i);
         
         currentTrack += " | " + branchMaster.main();
         
        
      }
   }   

}