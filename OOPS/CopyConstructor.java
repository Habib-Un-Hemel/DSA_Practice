package OOPS;
public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Hemel";
        s1.roll = 22;
        s1.password = "abcd";
        Student s2 = new Student(s1);
        s2.password = "xyz";
        System.out.println(s1.name);
        System.out.println(s1.password);
        System.out.println(s2.name);
        System.out.println(s2.password);
    }
}
class Student {
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student(){
        System.out.println("print ok!");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}