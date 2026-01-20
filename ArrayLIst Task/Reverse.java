import java.util.ArrayList;
import java.util.Collections;

public class Reverse
{
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();

        list.add("red");
        list.add("green");
        list.add("orange");
        list.add("white");
        list.add("black");

        System.out.println("List before Reversing");

        System.out.println(list);

         System.out.println("List After Reversing");

         Collections.reverse(list);
        System.out.println(list);
    }
}