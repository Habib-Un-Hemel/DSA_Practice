import java.util.*;

public class  basics_array {
    
//print method
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print elements in the same line
        }
        System.out.println(); // Print a new line after printing all elements
    }
    public static void main(String args[]) {
/*
 * covered topics
 *  - arrary introduction
 *  - Array declaration
 *  - Array creation
 *  - array types
 *  - Array Operations
 *  - Array probem(3)
 */
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
  
    // +++++++++++++++++++++++++++++++++++++++++
/*
 * 
 * 
 * 
 */
    Scanner sc = new Scanner(System.in);
    int arrL[] = new int[5];
    for(int i= 0; i<arrL.length; i++){
        //arrL[i] = sc.nextInt();
    }
    // Printing the concatenated array
        for (int num : arrL) {
            System.out.print(num + " ");
            System.out.println();
        }
        
   //Array reference
    System.out.println("Array reference in Java:"); 

    int arrRef[] ={1,2,4,5,6,67};
    int arrRef2[] = arrRef;
    int arrRef3[] = arrRef.clone();
    int arrRef4[] = Arrays.copyOf(arrRef, 2);
    int arrRef5[] = Arrays.copyOfRange(arrRef, 0, 4);
        System.out.println(arrRef); 
         printArray(arrRef);
        System.out.println(arrRef2); 
         printArray(arrRef2);
        System.out.println(arrRef3); 
         printArray(arrRef3);
        System.out.println(arrRef4); 
        printArray(arrRef4);
        System.out.println(arrRef5); 
        printArray(arrRef5);


    //problem4: count the perticular occruarance in a array

    // problem5: find the last occurrence of an element x in the a given array
    int arr_prob5[]= {1,5,3,5,6,7,9};
    int target_problem = 5; 


    ArrayList<Integer> Temp_arrList = new ArrayList<>();
    for (int i=0; i<arr_prob5.length; i++){
        if(arr_prob5[i]==target_problem){
            Temp_arrList.add(i);
        }
    }
    int len = Temp_arrList.size()-1; 
    System.out.println(len);
    System.out.println("the last index:"+ Temp_arrList.get(len));
    
    //method2 , i took help
    
    int lastIndex = -1;
        for (int i=0; i<arr_prob5.length; i++){
        if(arr_prob5[i]==target_problem)
        {
            lastIndex = i;
        }
        
    }
    System.out.println("Method2,the last index in: "+ lastIndex);

    //problem6: Count the number of element strictly greater than value X,

    int arr_prob6[]= {1,5,3,5,6,7,9};
    int x =3;
    int count =0;
    for (int i=0; i<arr_prob6.length; i++){
        if(arr_prob6[i]>x)
        {
            count++;
        }
    }
    System.out.println("count: "+count);

    //problem7: check if the given array is sorted or not
    int arr_prob7[]= {1,2,3,5,66,7,9};
    Boolean check7 = true;
    for (int i=0; i< arr_prob7.length-1; i++){
        if(arr_prob7[i] > arr_prob7[i]+1)
        {   System.out.println(check7);
            System.out.println("jsaa");
            check7 = false;
            
        }System.out.println("sorted or not sorted:"+ check7);
    
    }
    System.out.println("sorted or not sorted:"+ check7);




     System.out.println("MainFunction is ending Here !!!!");

    }
}


