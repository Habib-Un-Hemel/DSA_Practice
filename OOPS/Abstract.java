package OOPS;

public class Abstract {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);


    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    // animal has walk method but Animal class will not tell that
    // indivisual class will tell that 
    //only give a idea that animal needs to walk but impletment should be done by you
    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "Black";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}