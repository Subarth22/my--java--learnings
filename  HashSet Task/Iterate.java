import java.util.HashSet;

public class Iterate{
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");

            for(String col:list)
            {
            System.out.println(col);
            }
            

    }
}
