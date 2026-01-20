import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashToTree {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");

             System.out.println("The Hash Set : " +list);

             TreeSet<String> list2=new TreeSet<>(list);
             System.out.println("Treeset elements:");
             for(String col:list2)
             System.out.println(col);

    }
}
