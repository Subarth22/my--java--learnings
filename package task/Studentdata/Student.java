package Studentdata;

    public class Student
    {
        String name;
        int age;

        public void setdetails (String name, int age)
        {
            this.name=name;
            this.age=age;
        }

        public void displaydetais()
        {
            System.out.println("name : "+name);
            System.out.println("age : "+age);
        }

        public boolean isAdult()
        {
            return age >= 18;
        }
        public void greetStudent()
        {
            System.out.println("hello " + name);
        }   
    }

    