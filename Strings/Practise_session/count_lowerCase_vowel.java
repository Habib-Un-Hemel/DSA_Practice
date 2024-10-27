import java.util.Scanner;
public class count_lowerCase_vowel {

    public static int lowerCaseVowelCount(String str){
        int count = 0;
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)==true){
                if(ch == 'a' || ch == 'e'|| ch== 'i'||ch== 'o'||ch== 'u'){
                    count++;
                }
            }
        }return count;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowelCount = lowerCaseVowelCount(str);
        System.out.println("lower case vowel count is:"+ vowelCount);
    }
}
