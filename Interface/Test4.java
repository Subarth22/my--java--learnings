enum Pc
{
    Macbook(80000), Lenova( 40000), thinkpad,Hp( 77000);

    private Pc() {

        price=20000;
    }

    private int price;

    private Pc(int price)
    {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
public class Test4 
{
    public static void main(String[] args)
    {
        // Pc p=Pc.Macbook;
        // System.out.println(p);

        for(Pc p :Pc.values())
        {
            System.out.println(p + " : " + p.getPrice());
        }
    }
    
    


}
