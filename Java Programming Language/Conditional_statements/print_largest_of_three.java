package Conditional_statements;

public class print_largest_of_three {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 18;
        if (a>b && a>c){
            System.out.println("a is bigger");
        } else if(b>c && b>a){
            System.out.println("b is bigger");
        } else if(c>a && c>b){
            System.out.println("c is bigger");
        }
    }
}
