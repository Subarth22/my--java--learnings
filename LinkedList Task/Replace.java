

import java.util.LinkedList;

public class Replace{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);
        System.out.println("The value of second element changed.");

        list.set(1,"orange" );
        System.out.println("New linked list : "+list);
    }
}
