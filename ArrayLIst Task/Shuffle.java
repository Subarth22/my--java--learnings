import java.util.ArrayList;
import java.util.Collections;

public class Shuffle
{
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();

        list.add("red");
        list.add("green");
        list.add("orange");
        list.add("white");
        list.add("black");

        System.out.println("List before shuffling");

        System.out.println(list);

         System.out.println("List After shuffling");

         Collections.shuffle(list);
        System.out.println(list);
    }
}