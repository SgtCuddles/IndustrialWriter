import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.util.ArrayList;

public class IndustrialWriter(){

   //place main machine of each branch (up to 16 machines) into the array Mainline
   private ArrayList<Machine> mainline = new ArrayList<>();
   private ArrayList<String> voices =  new ArrayList{};

   
   private int tempo;
   private int[] timeSignature;
   
   public static void main(String[] args)
   {
      
   }   
   
   public static void voiceUpdater()
   {
      for(int i = 0; i < voices.size; i++)
      {
         String currentTrack = voices.get(i);
         Machine branchMaster = mainline.get(i);
         
         currentTrack += " | " + branchMaster.main();
      }
   }
   
   public static void voiceSetUp(int voiceNum; String instrument)
   {
      if (voiceNum < 16)
      {
         
      }
   }
   
   public static void setTempo(int tempo) {  this.tempo = tempo;  }
   
   public static void setTimeSignature(int top, int bottom) {  timeSignature = [top, bottom] }
   
   public static int getTempo()  {  return tempo;  }
   
   public static int[] getTimeSignature() {  return timeSignature; }
}