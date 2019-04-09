public class Machine
{  
   private String name;
   
   public Machine(String newName){  name = newName;   }
   
   public void setName(String newName){   name = newName;   }
   public String getName(){   return name;   }
   
   public void onTrigger()
   {
      System.out.println("Beep boop");  
   }
   
}
