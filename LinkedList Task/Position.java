import java.util.LinkedList;

public class Position {
    

    public static void main(String[] args) {
        

        LinkedList<String>list=new LinkedList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        list.add("orange");
        list.add("black");

        int startposition=2;
        System.out.println("the starting position is "+ startposition+":");
        for(int i=startposition;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        
    }
}
