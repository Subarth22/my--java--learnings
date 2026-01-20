
import java.util.LinkedList;

public class RetriveFirst{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);

       String First=list.getFirst();
       System.out.println("retrived element :"+First);

       System.out.println("Original linked list : "+list);

    }
}
