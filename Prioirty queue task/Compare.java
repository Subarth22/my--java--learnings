import java.util.PriorityQueue;

public class Compare
{
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("green");
        pq.add("blue");
        pq.add("orange");
        pq.add("black");

        System.out.println("Original Priority Queue:"+pq);

        PriorityQueue<String> pq1= new PriorityQueue<>();
        pq1.add("red");
        pq1.add("green");
        pq1.add("blue");
        pq1.add("orange");
        pq1.add("pink");

        System.out.println("Second Priority Queue:"+pq1);

       for(String color:pq)
       {
        if(pq1.contains(color))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
       }

    }
}