class Solution {
     public List<Integer> findMissingElements(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int ele : nums) {
            set.add(ele);
            min = Math.min(min, ele);
            max = Math.max
            (max,ele);

        }
        List<Integer> ans = new ArrayList<>();
        for(int i = min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}