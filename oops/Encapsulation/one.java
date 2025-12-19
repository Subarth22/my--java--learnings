class Human
{
    private String name;
    private int age;
    private int salary;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    

}


public class one
{
    public static void main(String args[])
    {
        Human obj= new Human();

        obj.setage(22);
        obj.setname("subarth");
        obj.setsalary(200000);


        System.out.println(obj.getname()+":"+obj.getage()+":"+obj.getsalary());

    }
}