
import java.util.Collections;
import java.util.LinkedList;



public class Swap
{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);
       Collections.swap(list, 0, 4);
    
       System.out.println("The New linked list : "+list);
    }
}
