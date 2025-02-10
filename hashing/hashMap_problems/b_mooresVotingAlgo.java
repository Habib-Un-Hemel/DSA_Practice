class Solution {
    public int majorityElement(int[] nums) {
        int freq =0;
        int ans =0;
        for(int i=0; i<nums.length; i++){
            if(freq==0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            }else{
                freq --;
            }
        }
        return ans;


//hashmap elementation

    // HashMap <Integer, Integer> map = new HashMap<>();
    //     //List<Integer> majorityElements = new ArrayList<>();

    //     int majorityElement = 0;
    //     for(int i=0; i<nums.length;i++){
    //         if (map.containsKey(nums[i])){
    //             map.put(nums[i], map.get(nums[i])+1);
    //         }else{
    //             map.put(nums[i], 1);
    //         }
    //     }
    //     for(int key: map.keySet()){
    //         if(map.get(key)> nums.length/2){
    //            majorityElement= key ;
    //         }
    //     }   
    //     return majorityElement;        
    }
}