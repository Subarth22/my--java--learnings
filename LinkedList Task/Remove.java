import java.util.LinkedList;

public class Remove{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);

       list.remove(2);
       System.out.println("The New linked list : "+list);
    }
}
