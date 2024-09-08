package OOPS;
public class CopyConstructor2 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Hemel";
        s1.roll = 22;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=70;
        s1.marks[2]=90;
        Student s2 = new Student(s1);
        s2.password = "xyz";

        //what s1 re change korleo s2 change , why???///
         s1.marks[2]=00;
        for (int i=0;i<3; i++ ){
            System.out.println(s2.marks[i]);
        }

    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     //array reference copy  
    //     this.marks = s1.marks;  
    // }

    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
         marks = new int[3];
        System.out.println("print ok!");
    }
    Student(String name){
         marks = new int[3];
        this.name = name;
    }
    Student(int roll){
         marks = new int[3];
        this.roll = roll;
    }
}