import java.util.LinkedList;

public class GetPosition{
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
   
       System.out.println("Original linked list : "+list);

        for(int i=0;i<list.size();i++)
        {
    
            System.out.println("Element at index "+i+":"+list.get(i));
        }
    }
}
