import java.util.PriorityQueue;

public class Insertf
{
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("green");
        pq.add("blue");
        pq.add("orange");
        pq.add("black");

        System.out.println("Original Priority Queue:"+pq);

        pq.remove("green");
        pq.add("maroon");
        System.out.println("The New Priority Queue:"+pq);
    }
}