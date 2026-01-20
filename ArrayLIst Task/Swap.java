import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    
    public static void main(String[] args) {
        
        ArrayList <String> list= new ArrayList<String>();
        list.add("red");
         list.add("green");
          list.add("blue");
           list.add("yellow");
            list.add("orange");
            
            
            System.out.println("Array list before Swap : ");
            for(String color:list)
            {
                System.out.println(color);
            }

            Collections.swap(list, 0, 3);
        
           
            System.out.println("array list after swap: " );
             for(String color:list)
            {
                System.out.println(color);
            }
    }
}
