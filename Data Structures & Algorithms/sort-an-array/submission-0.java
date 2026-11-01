class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            Arrays.sort(nums);
            return nums;
        }
        return(nums);
        
        
    }
}