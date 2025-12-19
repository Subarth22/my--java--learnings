class Printer 
{
    void print() 
    {
        class Ink 
        {
            void color() 
            {
                System.out.println("Black ink");
            }
        }
        Ink i = new Ink();
        i.color();
    }

    public static void main(String[] args)
     {
        Printer p = new Printer();
        p.print();
    }
}
