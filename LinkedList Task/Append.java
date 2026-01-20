import java.util.LinkedList;

public class Append {
    
    public static void main(String[] args) {
        

        LinkedList<String> list= new LinkedList<>();

        list.add("red");
        list.add("green");
        list.add("Black");
        list.add("white");
        list.add("black");

        //weather add or addlast , both these add elements in the last
        list.addLast("yellow");
        System.out.println("The linked list : " +list);

    }
}
