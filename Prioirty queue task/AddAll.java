import java.util.PriorityQueue;

public class AddAll
{    public static void main(String[] args) 
    {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("green");
        pq.add("blue");
       
        System.out.println(" Priority Queue 1:"+pq);

        PriorityQueue<String> pq1= new PriorityQueue<>();
        pq1.add("yellow");
        pq1.add("maroon");
        pq1.add("brown");

        System.out.println(" Priority Queue 2:"+pq1);
    
        pq.addAll(pq1);
      System.out.println("new priority queue1:"+pq);

    }
}