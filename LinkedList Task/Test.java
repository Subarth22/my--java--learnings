
import java.util.LinkedList;

public class Test{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);
         System.out.println("Check the above linked list is empty or not! "+list.isEmpty());

        list.clear();

        System.out.println("Linked list after remove all elements "+ list);
        System.out.println("Check the above linked list is empty or not! "+list.isEmpty());

    }
}
