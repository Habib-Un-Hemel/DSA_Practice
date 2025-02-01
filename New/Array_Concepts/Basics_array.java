public class  basics_array {
    public static void main(String args[]) {
    
    //array access
        int arr[] =new int[10];
        System.out.println(arr[7]);
        int arr10[] ={1,2,3,4,6};
    // length method of arr (arr.length)
        System.out.println("length of the 1D arr:" + arr.length);
    //2D array
    int arr2[][] = {{1,2},{4,5},{7,8}};
    int arr4[][]= new int[3][2];
    System.out.println(arr2[0][0]);
    System.out.println(arr2[0][1]);
    System.out.println(arr2[1][1]);

    //traversal of arr - for loop, while.

    //problem1 -> sum of the given an array
    int sum = 0;
    for(int i=0;i<arr10.length;i++){
        sum = sum +arr10[i];
    }
    System.out.println("sum:" + sum);
    //problem2 -> largest of the given an array
    int largest = 0;
    for(int i=0;i<arr10.length;i++){
        if (arr10[i]>largest){
            largest = arr10[i];
        }
    }
    System.out.println("largest:"+ largest);

    //problem3 -> search and give the element otherwise give -1
    int target = 6;
    for(int i=0;i<arr10.length;i++){
        if (arr10[i] == target){
        System.out.println("index:"+ i);
        }else{
            System.out.println(-1); 
        }
    }
  




    }



    


}

