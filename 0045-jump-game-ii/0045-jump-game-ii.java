class Solution {
    public int jump(int[] nums) {
        int currReach =0;
        int curmax =0;
        int maxjump = 0;
        for(int i=0; i< nums.length-1; i++){
            if(i+nums[i] > curmax){
                curmax = i+nums[i];
                
            }
            if( i== currReach){
                maxjump++;
                currReach = curmax;
            }
        }
        return maxjump;
    }
}