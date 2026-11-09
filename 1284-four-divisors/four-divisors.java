class Solution {
     public int sumFourDivisors(int[] nums) {

        int answer = 0;
        for(int num : nums) {

            int count = 0;
            int sum = 0;
            for (int i = 1; i*i <= num; i++) {
                if(num % i == 0){
                    int div = num/i;
                    sum+=i;
                    count++;
                    if(i!=div){
                        sum+=div;
                        count++;
                    }
                    if(count>4){
                        break;
                    }
                }
            }
            if(count==4){
                answer+= sum;

            }
        }
     return answer;
    }
}