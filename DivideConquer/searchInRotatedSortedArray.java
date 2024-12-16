//Question link: (medium) https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1478379349/
//binary search modified 
    // recursive way te binary search liksi

// eita bianry search er iteration diyeo kora jabe  
public class searchInRotatedSortedArray {
    public static int search(int arr[],int target, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }
        // find mid
        int mid = (si + ei )/2;
        if (arr[mid]== target){
            return mid;
        }
        // L1 
        if( arr[si]<= arr[mid]){
            //case a: 
            if( arr[si]<= target && target <= arr[mid] ){
                return search(arr, target, si, mid-1);
            }    //case b: 
            else{
                return search(arr,target, mid+1,ei);
            }
        }
        //L2
        else{
            //case c:
            // if(arr[mid]<= target <= arr[ei]){           //python e amon korso Hemel ):
            if(arr[mid]<= target && target <= arr[ei]){

                 return search(arr, target, mid+1, ei);
            //case d: 
            }else{
              return search(arr, target,si, mid -1);
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {4 ,5, 6, 7,0,1,2};
        int target = 101;
        int target_index = search(arr, target, 0, arr.length-1);
        System.out.println(target_index);
    }
}
