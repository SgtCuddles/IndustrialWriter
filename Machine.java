import java.util.ArrayList;

public class Machine//finish implementing masters and followers
{  
   private String name;
   private int voice;
   
   private ArrayList<Machine> masters;
   
   private ArrayList<Machine> followers;
   
   public Machine(String newName){  name = newName;   }
   
   public void setName(String newName){   name = newName;   }
   public void setVoice(int voice){ this.voice = voice;  }
   
   public String getName(){   return name;   }
   public int getVoice(){  return voice;  }
   public ArrayList<Machine> getMasters(){   return masters; }
   
   public void trigger()
   {
      System.out.println("Beep boop");  
   }
   
}
