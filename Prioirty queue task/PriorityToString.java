

import java.util.PriorityQueue;

public class PriorityToString {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("yellow");
        pq.add("green");
        pq.add("blue");
        System.out.println("Original Priority Queue : "+pq);

       String arr= pq.toString();
       System.out.println("String representation of the Priority Queue: "+arr);
       
    }
}
