package OOPS;

public class ConstructorOverloading {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Hemel");
        Student s3 = new Student(22241042);
        
       // Student s4 = new Student("Hemel", 22241042); it will give error
       // if one constructor will be created that time java will not create any constructor by own
        // construcor overloading -> automatic suitable constor will be called 

    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("first constructor is ready!!!");
    }
    Student(String name){
        this.name = name;
        System.out.println(name);
    }
    Student(int roll){
        this.roll = roll;
        System.out.println(roll);
    }
}