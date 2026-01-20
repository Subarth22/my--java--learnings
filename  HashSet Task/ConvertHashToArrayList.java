
    import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashToArrayList {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");

             System.out.println("The Hash Set : " +list);

             ArrayList<String> list2=new ArrayList<>(list);
             System.out.println("ArrayList contains:"+list2);

    }
}

