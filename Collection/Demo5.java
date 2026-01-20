import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student 
{
    int age;
    String name;
    

    public Student(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "student [age=" + age + ", name=" + name + "]";
    }

    


}

public class Demo5 {
    public static void main(String[] args) {
    

        Comparator<Student> com= ( i, j)-> i.age>j.age?1:-1;
             
    
      List<Student> studs= new ArrayList<Student>();
      
      studs.add(new Student(23, "subarth"));
      studs.add(new Student(43, "raja"));
       studs.add(new Student(18, "ramkumar"));
      studs.add(new Student(22, "navin"));

        Collections.sort(studs, com);
        for(Student s:studs)
        System.out.println(s);
        

    
}
}
