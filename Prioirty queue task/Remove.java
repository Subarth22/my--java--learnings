import java.util.PriorityQueue;

public class Remove
{
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("green");
        pq.add("blue");
        pq.add("orange");
        pq.add("black");

        System.out.println("Original Priority Queue:"+pq);

        pq.clear();
        System.out.println("The New Priority Queue:"+pq);
    }
}