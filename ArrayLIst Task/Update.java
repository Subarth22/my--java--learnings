import java.util.ArrayList;


public class Update
{
    public static void main(String[] args) {
        
        ArrayList<String> col= new ArrayList<String>();
        
        col.add("Red");
        col.add("Green");
        col.add("Orange");
        col.add("White");
        col.add("Blue");


        System.out.println(col);

        col.set(2, "yellow");

        System.out.println(col);
    }
}