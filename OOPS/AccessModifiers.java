package OOPS;

public class AccessModifiers {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username =  "Hemel";
        System.out.println(myAcc.username);  //possible to access as its public modifiers;
        //myAcc.Password = "abc"; //not possible as its a private modifier
        myAcc.setPassword("abcde");   
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}