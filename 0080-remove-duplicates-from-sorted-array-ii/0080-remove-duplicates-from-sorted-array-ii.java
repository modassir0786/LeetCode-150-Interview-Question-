class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       for(int ans : nums){
        if(i < 2 || nums[i-2] != ans){
            nums[i++] = ans;
        }
       }
       return i;
    }
}