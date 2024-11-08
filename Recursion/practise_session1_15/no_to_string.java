public class no_to_string {

    public static void print_digits_inWord(String arr[],int n){
        if( n == 0 ){
            return;
        }
        
        int last_digit =  n%10;
        print_digits_inWord(arr, n/10 ); 
        System.out.print(arr[last_digit] + "   ");


    }


    public static void main(String args[]){
        String arr[] = {"zero", "one","two", "three", "four", "five", "six","seven","eight", "nine"};
        int n = 3321;
        print_digits_inWord(arr,n);
    }
}

//side case if number starts with 0 , the code can not solve it 
