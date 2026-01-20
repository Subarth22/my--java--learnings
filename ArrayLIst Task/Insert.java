import java.util.ArrayList;


public class Insert
{
    public static void main(String[] args) {
        
        ArrayList<String> col= new ArrayList<String>();
        
        col.add("Red");
        col.add("Green");
        col.add("Orange");
        col.add("White");
        col.add("Blue");


        System.out.println(col);
       col.add(0,"pink");
        col.add(5,"yellow");
        System.out.println(col);
        

    }
}