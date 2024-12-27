
public class oops_practise {
     public static void main(String[] args) {
           Student s1 = new Student(); 
           Teacher t1 = new Teacher(); //initialize the 
           Topper top1 = new Topper("Hemel"); 
        }
}
class Student{
    String name;
    int roll;
}
class Teacher{
    String name;
    int salary;
    Teacher(){
        System.out.println("Money is power");
    }
}
class Topper{
    String name;
    int grade;
    Topper(String nam){
        this.name = nam;
        System.out.println(nam);
        System.out.println(name);
        System.out.println(this.name + " loves code");
    }

}