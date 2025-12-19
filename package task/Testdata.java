import Studentdata.Student;
import Studentdata.Marks;
public class Testdata {
    
        public static void main(String[] args)
        {
            Student s=new Student();
            s.setdetails("subarth" ,22);
            s.displaydetais();
            s.greetStudent();
            System.out.println("is adult : "+s.isAdult());


            Marks m=new Marks();
            m.setMarks(80,99,90);

            
            System.out.println("total marks : "+ m.totalMarks());
            System.out.println("average  : "+ m.average());
            System.out.println("highest marks : "+ m.highestMarks());


        }

        
}
