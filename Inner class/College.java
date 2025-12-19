public class College
{
    static String name="SNS college";

    static class Department
    {
        void display()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        College.Department d= new College.Department();
        d.display();

    }
}