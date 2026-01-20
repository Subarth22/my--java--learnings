
import java.util.LinkedList;

public class Check{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);
        System.out.println(list.contains("green") ?"Color Green is present in the linked list.":"Color Green is not present in the linked list.");
       System.out.println(list.contains("Orange") ?"Color Orange is present in the linked list.":"Color Orange is not present in the linked list.");
    }
}
