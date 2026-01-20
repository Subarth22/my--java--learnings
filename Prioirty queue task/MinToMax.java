
import java.util.Collections;
import java.util.PriorityQueue;



public class MinToMax {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(86);
        pq.add(54);
        pq.add(84);
        pq.add(98);
        pq.add(44);
        pq.add(66);
        pq.add(23);
        pq.add(103);

        System.out.println("Original Priority Queue:"+pq);


        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        maxpq.addAll(pq);
        System.out.println("Maximum Priority Queue: ");
        while (!maxpq.isEmpty()) {
            
            System.out.println(maxpq.poll()+" ");
        }


        
    }
}
