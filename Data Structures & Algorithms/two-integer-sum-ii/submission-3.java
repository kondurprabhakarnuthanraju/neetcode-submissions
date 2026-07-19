class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int l=0;
        for(int i=0;i<numbers.length;i++){
            if(sum<target){
                sum=sum+numbers[i];
            }
            int cnt=0;
            while(sum>target && cnt<100){
                sum=sum-numbers[l];
                cnt++;
            }
            if(sum==target){
                return new int[]{l+1,1+i};
            }

        }
        return new int[]{};
    }
}
