class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int i = m-1;
       // int j= n-1;
      //  int index = m+n-1;
      //  while(j >= 0)
           // if(i >= 0 && nums1[i] > nums2[j])
           // nums1[index--] = nums1[i--];

          //  else 
           // nums1[index--] = nums2[j--];

           // 2nd method
           for(int j=0, i = m; j < n; j++){
            nums1[i] = nums2[j];
            i++;

           }
           Arrays.sort(nums1);
        
        
    }
}