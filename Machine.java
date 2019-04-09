import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Machine
{  
   private String name;
   
   public Machine(String newName){  name = newName;   }
   
   public void setName(String newName){   name = newName;   }
   public String getName(){   return name;   }
   
}
