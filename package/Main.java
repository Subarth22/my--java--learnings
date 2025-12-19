

import Mathops.Adition;
import Mathops.Subtraction;
import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        
            Adition obj= new Adition();
            int r1= obj.Add(2,4);
            System.out.println(r1);
            Subtraction obj1= new Subtraction();
            int r2=obj1.sub(5,8);
            System.out.println(r2);


            Circle obj0=new Circle();
            int r3=obj0.area(4);
            System.out.println(r3);
    }
}   
