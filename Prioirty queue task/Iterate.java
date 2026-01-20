import java.util.PriorityQueue;

public class Iterate
{
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("green");
        pq.add("blue");
        pq.add("orange");
        pq.add("black");
        System.out.println("Elements of the Priority Queue:");
        for(String col:pq)
        System.out.println(col);

    }
}