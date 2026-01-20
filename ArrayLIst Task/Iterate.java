import java.util.ArrayList;

public class Iterate {
    
    public static void main(String[] args) {
        

        ArrayList<String> col= new ArrayList<>();
        col.add("Red");
        col.add("Green");
        col.add("blue");
        col.add("orange");
        col.add("yellow");

        int i=1;
        for(String c:col)
        {
        System.out.println(i+"."+c);
        i++;
        }


    }
}
