
import java.util.LinkedList;



public class RFirstandLast{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);
         String Frist=list.removeFirst();
        System.out.println("Element removed : "+Frist);
       String Last= list.removeLast();
        System.out.println("Elements removed : "+Last);
    
       System.out.println("The New linked list : "+list);
    }
}
