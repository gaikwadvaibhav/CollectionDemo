import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by melayer on 21/8/17.
 */
public class User_define_class {

    public static void main(String[] args) {

        Student s1= new Student(101,"Vaibhav",22);
        Student s2=new Student(102,"Hrishi",23);
        Student s3=new Student(103,"Raj",25);

        ArrayList<Student> StudList = new ArrayList<Student>();
        StudList.add(s1);
        StudList.add(s2);
        StudList.add(s3);

        Iterator itr=StudList.iterator();

        while (itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno +" "+st.name +" "+st.age);
        }
    }

}

class Student{
    int rollno;
    String name;
    int age;

    Student(int rollno,String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
