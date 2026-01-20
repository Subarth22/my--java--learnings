import java.util.ArrayList;


public class Empty
{
    public static void main(String[] args) {
        
        ArrayList<String> col= new ArrayList<String>();
        
        col.add("Red");
        col.add("Green");
        col.add("Orange");
        col.add("White");
        col.add("Blue");


        System.out.println(col);

        col.clear();
        System.out.println(col);

    }
}