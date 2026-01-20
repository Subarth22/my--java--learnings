
import java.util.LinkedList;

public class RemoveFirst{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);

       String First=list.remove(0);
       System.out.println("Removed element : "+First);
       System.out.println("Linked list after pop operation:"+list);
    }
}
