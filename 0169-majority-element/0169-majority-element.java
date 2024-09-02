class Solution {
    public int majorityElement(int[] nums) {
       // int cand =0;
        //int count =0;
        //for(int i=0; i< nums.length; i++){
          //  if(count ==0 ){
              //  cand = nums[i];
           // }if(cand == 0){
           //     count = nums[i];
           //     count++;
           // }else{
           //     count--;
           // }
        //}
       // return cand;
       java.util.Arrays.sort(nums);
       return nums[nums.length/2];
        
    }
}