class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zerocount=0;
        int forall=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }
            else{
                zerocount++;
            }
            forall=forall*nums[i];
        }
        int res[]=new int[nums.length];
        for(int j=0;j<nums.length;j++){
            
             if(nums[j]==0 && zerocount>1){
                res[j]=0;
            }
            else if (nums[j]==0 && zerocount<=1){
                res[j]=prod;
            }
            else if(zerocount>1){
                res[j]=0;

            }
            else{
                res[j]=forall/nums[j];
            }
        }
        return res;
        
    }
}  
