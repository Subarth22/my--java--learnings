import java.util.LinkedList;

public class Sposition {
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
        System.out.println("Original linked list:");
        System.out.println("Let add the Yellow color after the Red Color : "+list);


        list.add(1, "yellow");
        System.out.println("The linked list:"+list);
    }
}
