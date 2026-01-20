import java.util.ArrayList;


public class Increase
{
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();
        
        list.add("Red");
        list.add("Green");
        list.add("Orange");

        System.out.println("Original array list : "+list);

        list.ensureCapacity(6);;
        
         list.add("blue");
        list.add("yellow");
        list.add("maroon");

        System.out.println("New array list : "+list);

    }
}