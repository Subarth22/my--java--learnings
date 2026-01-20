import java.util.LinkedList;

public class Iterate {
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");
        list.addLast("yellow");


        for(String color:list)
        System.out.println(color);

    }
}
