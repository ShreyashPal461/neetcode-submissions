class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans.add(nums[i]);
        }
        Collections.sort(ans);
        for(int i=0;i<n;i++){
            nums[i]=ans.get(i);
        }
        
    }
}