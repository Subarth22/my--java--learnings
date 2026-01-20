import java.util.ArrayList;
public class Search
{
    public static void main(String[] args) {
        
        ArrayList<String> col= new ArrayList<String>();
        
        col.add("Red");
        col.add("Green");
        col.add("Orange");
        col.add("White");
        col.add("Blue");

        if(col.contains("Green"))
        {
            System.out.println("found the element");
        }
        else
            System.out.println("not found the element");
     

    }
}