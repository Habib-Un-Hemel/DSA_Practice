
public class substring {
    public static String sub_String(String str,int si ,int ei){
        String newStr = "";
        for (int i=si; i<ei;i++){
            newStr += str.charAt(i);
        }
        return newStr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println(sub_String(str,0,5));
        System.out.println(str.substring(0,7));
    }
}
