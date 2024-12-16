package BackTracking;

public class subsets_string {
    




    public static void subset(String str, String ans, int i){
        //base
        if (i == str.length()){
                    System.out.println(ans);
            return;

        }
        //work
        //yes decesion
        subset(str, ans+str.charAt(i), i+1);

        //no choice
        subset(str, ans, i+1);
    }
    public static void main( String args[]){
        String str = "ab";
        subset(str," ",0);

    }
}
