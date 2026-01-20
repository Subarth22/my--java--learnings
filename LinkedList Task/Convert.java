
import java.util.LinkedList;
import java.util.ArrayList;
public class Convert{
    
    public static void main(String[] args) {
        

        LinkedList<String> linkedlist= new LinkedList<>();


        linkedlist.add("red");
        linkedlist.add("green");
        linkedlist.add("Black");
        linkedlist.add("white");
        linkedlist.add("black");
   
       ArrayList<String> arraylist=new ArrayList<>(linkedlist);
       System.out.println("LinkedList: "+linkedlist);
       System.out.println("ArrayList: "+arraylist);
       
    }
}
