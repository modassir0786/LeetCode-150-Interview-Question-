class Solution {
    public int removeElement(int[] nums, int val) {
        int index =0;
       // List arr = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
                //arr.add(nums[i]);
            }
        }
        return index;
       //return arr.size();
        
    }
}