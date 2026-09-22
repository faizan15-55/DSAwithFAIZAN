class Solution {
  public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int freq : map.values()){
            if(set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;

    }
}