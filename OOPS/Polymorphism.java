package OOPS;

public class Polymorphism {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        // System.out.println(cal.sum(2.3+3.8)); 
        System.out.println(calc.sum((float)2.3, (float)3.8)); //type casting 

        System.out.println(calc.sum(2, 3 ,9));
    }
    
}

//function overloading  
//  complier , complie time e info ashe jei polymorphism er bepar ase
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}