
import java.util.HashSet;

public class Check{
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
        list.add("green");
        list.add("bliue");
        list.add("orange");
        list.add("pink");
        list.add("maroon");

        System.out.println("original Hashset : "+list);
       System.out.println("Checking the above array list is empty or not!"+ list.isEmpty());
       System.out.println("Remove all the elements from a Hash Set:");
       list.clear();
          System.out.println("Hash Set after removing all the elements"+list);  
           System.out.println("Checking the above array list is empty or not!"+ list.isEmpty());

    }
}
