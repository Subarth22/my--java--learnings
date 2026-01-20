import java.util.HashSet;

public class Clone {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");

             System.out.println("Original Hash Set : " +list);
            System.out.println("Cloned Hash Set:"+list.clone());
    }
}
