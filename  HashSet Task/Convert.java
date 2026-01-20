
import java.util.HashSet;

public class Convert {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");

             System.out.println("Original Hash Set : " +list);

            String [] array= list.toArray(new String[0]);

            for(String s:array)
            {
                System.out.println(s);
            }

    }
}
