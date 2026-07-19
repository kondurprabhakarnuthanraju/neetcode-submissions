class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int l=0;
        for(int i=0;i<numbers.length;i++){
            if(sum<target){
                sum=sum+numbers[i];
            }
            while(sum>target){
                sum=sum-numbers[l];
            }
            if(sum==target){
                return new int[]{l+1,1+i};
            }

        }
        return new int[]{};
    }
}
