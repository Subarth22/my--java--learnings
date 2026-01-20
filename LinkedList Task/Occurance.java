import java.util.LinkedList;

public class Occurance{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);

         String First=list.getFirst();
        System.out.println("First Element is : "+First);
        String Last=list.getLast();
        System.out.println("Last Element is : "+Last);
    }
}
