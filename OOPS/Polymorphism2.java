package OOPS;

public class Polymorphism2 {
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

// method overriding  take the child classes function
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}