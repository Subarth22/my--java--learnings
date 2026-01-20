import java.util.Collections;
import java.util.LinkedList;

public class Reverse {
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");

       System.out.println("before the reversing : "+list);

       Collections.reverse(list);
        System.out.println("after reversing :");
       for(String col:list)
   
       System.out.println(col);

    }
}
