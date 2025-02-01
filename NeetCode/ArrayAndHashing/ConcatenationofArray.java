//https://leetcode.com/problems/concatenation-of-array/
// easy problem 
/*
approach by me 
    -> make a new array with double size
    -> store it 2 types
    -> space complextiy (2n)= O(n) 
    -> time complextiy O(n)

    done with others submission (same things they had done)

*/
public class ConcatenationofArray {
    static int[] concatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i =0; i<nums.length;i++){
            arr[i]= nums[i];
            arr[nums.length+i] = nums[i];
        }return arr;
    }

    public static void main(String[] args) {
    int arr[] = {1,2,3};
    int[] ans = concatenation(arr);
    // Printing the concatenated array
    for (int num : ans) {
        System.out.print(num + " ");
    }
}
}
