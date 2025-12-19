class Bike
{
    public void speed()
    {
        System.out.println("it goes upto 100kmph");
    }
    
}

class SuperBike extends Bike
{
    public void speed()
    {
        System.out.println(("it goes upto 300kmph"));
    }

    public void type()
    {
        System.out.println("it is supersport bike");
    }
}

class electricBike extends Bike{

public void type()
{
    System.out.println("it runs on battery");
}

}


public class Upcasting {
    
    public static void main(String[] args) {
        Bike B= new SuperBike();
        B.speed();
        Bike C= new model();
        C.type();
    }
}
