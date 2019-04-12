import java.util.ArrayList;

public class NoteGen extends Machine
{
   private Signal master;
   
   public noteGen(String name){  super(name);   }
   
   public onTrigger()
   {
      return (Signal.getCount());
   }
}