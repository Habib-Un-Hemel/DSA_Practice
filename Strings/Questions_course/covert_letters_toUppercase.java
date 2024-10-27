
//O(n)
public class covert_letters_toUppercase {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("hi, i am hemel and loves to code"); 
        StringBuilder sd = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sd.append(ch);
        //system.out.println(sd);

        for (int i =1 ;i<str.length() ;i++){
            if(str.charAt(i)== ' ' && i< str.length()-1){
                sd.append(str.charAt(i)); //empty space ta add kortesi
                i++;
                sd.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sd.append(str.charAt(i));
            }
        }System.out.println(sd);

    } 
}
