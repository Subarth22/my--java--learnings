import java.util.ArrayList;
import java.util.List;
public class Extract {
    
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();

        list.add("Red");
          list.add("Green");
            list.add("Blue");
              list.add("Yellow");
                list.add("Orange");


                System.out.println("original List : "+ list);

                List<String>color=list.subList(0, 3);
             
                System.out.println("List of first three elements : "+color);

    }
}
