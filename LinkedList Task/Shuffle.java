
import java.util.Collections;
import java.util.LinkedList;



public class Shuffle
{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println(" Linked list before shuffling: "+list);
      Collections.shuffle(list);
    
       System.out.println("Linked list after shuffling : "+list);
    }
}
