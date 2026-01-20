import java.util.HashSet;

public class Retain {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
           

             System.out.println("First Hash Set : " +list);

              HashSet<String> list1= new HashSet<>();
        list1.add("red");
         list1.add("black");
          list1.add("pink");
           list1.add("orange");
           System.out.println("Second hashset : "+list1);
            
           list.retainAll(list1);

          System.out.println("HashSet content:"+list);
           

    }
}