class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
       for(int i : nums){
           set.add(i);
       }
        for(int i = 1;i<=n;i++){
            if(!set.contains(i)){
                ans.add(i);
                
            }

        }
        return ans;

    }
}