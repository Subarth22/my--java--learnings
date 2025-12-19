interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, comile, run : faster");
    }
}

class Developer
{
    public void devapp(Computer orange)
    {
        orange.code();
    }
}

public class Company 
{

    public static void main(String[] args) 
    {
        Computer Lap= new Laptop();
        Computer desk= new Desktop();
        
        Developer subarth= new Developer();
        subarth.devapp(desk);

    }
}