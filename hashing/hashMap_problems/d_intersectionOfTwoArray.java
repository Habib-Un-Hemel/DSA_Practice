// https://leetcode.com/problems/intersection-of-two-arrays/
/*

return array kora lagche not,arrayList best solution
 * class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        ArrayList <Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length;i++){
            if(set.contains(nums2[i])){
         
                arrayList.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }

        return result;

    }
}
 */
import java.util.*;;
public class d_intersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,9};
        int arr2[]= {2,3,4,2,7,8,9};

        HashSet <Integer> set = new HashSet<>();
        ArrayList <Integer> arrayList = new ArrayList<>();

        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            if(set.contains(arr2[i])){
                arrayList.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }

        System.out.println(set);
        System.out.println(arrayList);

        

    }
}
