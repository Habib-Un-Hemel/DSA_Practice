package OOPS;

public class ClassObject{
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a object named p1  // new is a keyword  // Pen(); constructor -> speical function under class
        p1.setColor("red");
        System.out.println(p1.color);
        p1.tip = 10;
        System.out.println(p1.tip);
    }
    
}

//class is also a keyword
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}