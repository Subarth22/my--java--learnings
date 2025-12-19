class add
{
    private int num1;
    private int num2;

    public void  setnum1(int n1)
    {
            num1=n1;
    }
    public void setnum2(int n2)
    {
        num2=n2;
    }

    public int getsum()
    {
        return num1 + num2;
    }
}




public class sum 

{
    
    public static void main(String args[])
    {
    add obj= new add();
    obj.setnum1(20);
    obj.setnum2(30);

    System.out.println("sum = "+ obj.getsum());
}
}

