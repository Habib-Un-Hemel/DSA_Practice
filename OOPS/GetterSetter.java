package OOPS;

public class GetterSetter {
    public static void main(String args[]){
        Pen p1  = new Pen();
        //System.out.println(p1.color);        //possibale na direct access kora color ke as its private 
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){         
        color = newColor;
    }
    // both are correct but use of "this" keyword is good
    // void setTip(int newTip){
    //     tip = newTip;
    // }
    void setTip(int tip){
        this.tip = tip;
    }
}