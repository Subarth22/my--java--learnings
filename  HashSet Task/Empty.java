
import java.util.HashSet;

public class Empty{
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
        list.add("green");
        list.add("bliue");
        list.add("orange");
        list.add("pink");
        list.add("maroon");

        System.out.println("original Hashset : "+list);
        list.clear();
        System.out.println("Hash Set after removing all the elements: " +list);
            

    }
}
