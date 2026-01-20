import java.util.ArrayList;


public class Replace
{
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();
        
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Blue");


        System.out.println("original arraylist: "+ list);

        list.set(1, "yellow");
        System.out.println("updated arraylist : "+list);

    }
}