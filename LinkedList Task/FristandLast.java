import java.util.LinkedList;

public class FristandLast {
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
       System.out.println("Original linked list : "+list);

       list.addFirst("white");
       list.addLast("pink");
       System.out.println("Final linked list : "+list);


    }
}
