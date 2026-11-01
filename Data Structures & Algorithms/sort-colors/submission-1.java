class Solution {
    public void sortColors(int[] nums) {
        // ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int lo=0;
        int mid=0;
        int hi=n-1;
        while(mid<=hi){
            if(nums[mid]==0){
                int temp = nums[lo];
                nums[lo]=nums[mid];
                nums[mid]=temp;
                lo++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[hi];
                nums[hi]=temp;
                hi--;

            }

        }
        
    }
}