class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> main=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // int l=j+1;
                int r=nums.length-1;
                while(j<r){
                    if(nums[i]+nums[j]+nums[r]==0){
                        List<Integer> lst=new ArrayList<>();
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[r]);
                        if(!main.contains(lst)){
                            main.add(lst);
                        }
                    }
                    r--;
                }
            }
        }
        return main;
        
    }
}
