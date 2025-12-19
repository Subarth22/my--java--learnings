class Bike
{
    public void speed()
    {
        System.out.println("it goes upto 100kmph");
    }
    public void type()
    {
        
    }
}

class SuperBike extends Bike
{
    public void speed()
    {
        System.out.println(("it goes upto 300kmph"));
    }
}

class Model extends Bike
{

public void type()
{
    System.out.println("suoer sport bike");
}

public void year()
{
    System.out.println("2002");
}
public void color()
{
    System.out.println("metallic red");
}
}


public class Downcasting {
    
    public static void main(String[] args) {
        Bike B= new Model();
        B.speed();

      
        Model m=(Model) B;
        m.color();
        m.year();
    }
}

