package OOPS;

public class Constructor {
    public static void main(String args[]){
        Student s1  = new Student();
        Teacher t1 = new Teacher("Farhan Ferdous");
        Authority a1 = new Authority("Abed");
    }
}
// in the beginning I did not do anything like creating constructor but now???
// -> if I dont write constructor on it , java automatically create constructor but that time we cant initialize any data
class Student {
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called!");
    }
}

class Teacher {
    String name;
    int roll;

    Teacher(String name){
        System.out.println(name);
    }
}
class Authority {
    String name;
    int roll;

    Authority(String name){
        this.name = name;
        System.out.println(name);
    }
}

