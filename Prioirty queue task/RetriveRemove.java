import java.util.PriorityQueue;

public class RetriveRemove {
    
     public static void main(String[] args) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(1);
          pq.add(2);
            pq.add(3);
              pq.add(4);
                pq.add(5);
                  pq.add(6);
                    pq.add(7);

                    System.out.println(pq);

                    System.out.println("The first element of the Queue: "+pq.poll());
                    System.out.println(pq);
    }
}
