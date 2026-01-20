import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Put {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm= new HashMap<>();
        hm.put(1, "Red");
         hm.put(2, "green");
          hm.put(3, "blue");
           hm.put(4, "orange");
            hm.put(5, "violet");

            for(Integer key:hm.keySet())
            {
                System.out.println(key +" "+hm.get(key));
            }
        

            Set<Map.Entry<Integer, String>>set= hm.entrySet();
            System.out.println(set);

    }
}
