interface Car 
{

    void Start();
    void Gear();
    void Seatbelt();
    void Accleration();
}
    


class Driver implements Car
{
    public void Start()
    {
        System.out.println("first start the car");
    }


     public void Seatbelt() {
        
        System.out.println("then put the seat belt on");
    }


    public void Gear() {
        System.out.println("then change the gear from nutral to first");
        
    }

    public void Accleration() {
        System.out.println("after that accelerate the car");
        
    }

   
}



   public class Main
{
    public static void main(String[] args) {
        Car obj = new Driver();
        obj.Start();
        obj.Seatbelt();
        obj.Gear();
        obj.Accleration();
    }
}
