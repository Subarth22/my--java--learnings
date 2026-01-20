import java.util.PriorityQueue;

public class Count
{
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("green");
        pq.add("blue");
        pq.add("orange");
        pq.add("black");

        System.out.println("Original Priority Queue:"+pq);

       
        System.out.println("Size of the Priority Queue:"+ pq.size());
    }
}