
import java.util.LinkedList;

public class RetriveLast{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);

       String Last=list.getLast();
       System.out.println("retrived element :"+Last);

       System.out.println("Original linked list : "+list);

    }
}
