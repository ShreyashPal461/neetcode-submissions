class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);

            }   
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                ans.add(key);
            }
        }
        return ans;
        
    }
}