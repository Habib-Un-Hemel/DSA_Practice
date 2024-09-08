package OOPS;

public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}
//base class
class Animal{
    String color;

    void eat(){
      System.out.println("eats");  
    }
    void breathe(){
        System.out.println("breathe");  
    }
}

//derived class / subclass
class Fish extends Animal{
    String fins;
    void swim(){
        System.out.println("Swim in water");
    }
}

