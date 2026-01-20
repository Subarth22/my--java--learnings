import java.util.HashSet;

public class Remove {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");

             System.out.println("The Hash Set : " +list);
             list.clear();
            System.out.println("after remove"+list);
            
    }
}
