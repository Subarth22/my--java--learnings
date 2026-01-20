import java.util.ArrayList;

public class Equals {

    public static void main(String[] args) {
        
        ArrayList<String>list= new ArrayList<String >();

        list.add("red");
        list.add("blue");
        list.add("green");

       ArrayList<String>list2= new ArrayList<String >();

        list2.add("red");
        list2.add("blue");
        list2.add("green");

         ArrayList<String>result= new ArrayList<String >();
        for(int i=0; i<list.size();i++ )
        {
            if(list.get(i).equals(list2.get(i)))
            {
                    result.add("yes");

            }
            else
                result.add("no");

        }
        System.out.println(result);
    
    }
}
