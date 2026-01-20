


import java.util.HashSet;

public class Compare {
    
    public static void main(String[] args) {
        
        HashSet<String> list= new HashSet<>();
        list.add("red");
         list.add("green");
          list.add("bliue");
           list.add("orange");
            list.add("pink");
             list.add("maroon");


             System.out.println("The Hash Set : " +list);

            HashSet<String> list1= new HashSet<>();
        list1.add("red");
         list1.add("green");
          list1.add("bliue");
           list1.add("orange");
            list1.add("pink");
             list1.add("maroon");
             
            for(String color:list)
            {
                if(list1.contains(color))
                {
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
             

    }
}

