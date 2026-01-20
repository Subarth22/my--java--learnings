import java.util.ArrayList;
import java.util.List;
public class Retrive {
    
    public static void main(String[] args) {
        
        List<String> list= new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("white");
        list.add("black");


        System.out.println(list);
        System.out.println("First element"+":"+ list.get(0));
        System.out.println("Third element"+":"+list.get(2));
    }
}
