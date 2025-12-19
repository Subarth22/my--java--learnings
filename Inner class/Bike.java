class Bike
{
    String brand="kawasaki";

    class Engine
    {
        void show()
        {
            System.out.println("this engine has inline 4 ");
        }
        
    }
        public static void main(String args[])
            {
                Bike b= new Bike();
                Bike.Engine E=b.new Engine();
                E.show();
            }
        

}