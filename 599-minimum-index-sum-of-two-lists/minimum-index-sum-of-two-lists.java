

class Solution {
      public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<list1.length;i++ ){
            map.put(list1[i], i);

        }

        int minIdx = Integer.MAX_VALUE;
        for(int j = 0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                if(j+map.get(list2[j]) < minIdx) {
                    minIdx = j+map.get(list2[j]);
                    result = new ArrayList<>();
//                  
                    result.add(list2[j]);
                } 
                else if(j+map.get(list2[j])== minIdx){
                    result.add(list2[j]);
                }
            }
        }
        String[] ans = new String[result.size()];

        for(int i = 0; i< result.size();i++){
            ans[i] = result.get(i);
        }
        return ans;

    }
// public String[] findRestaurant(String[] list1, String[] list2) {
//     HashMap<String, Integer> map = new HashMap<>();

//     for (int i = 0; i < list1.length; i++) {
//         map.put(list1[i], i);
//     }

//     List<String> result = new ArrayList<>();
//     int minSum = Integer.MAX_VALUE;

//     for (int j = 0; j < list2.length; j++) {

//         if (map.containsKey(list2[j])) {

//             int sum = map.get(list2[j]) + j;

//             if (sum < minSum) {
//                 minSum = sum;
//                 result.clear();
//                 result.add(list2[j]);
//             } 
//             else if (sum == minSum) {
//                 result.add(list2[j]);
//             }
//         }
//     }

//     return result.toArray(new String[0]);
// }


}
