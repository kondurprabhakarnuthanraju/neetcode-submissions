class Pair{
    int a;
    int b;
    Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        // int arr[][]=new int[nums.length][1];
        List<Pair> lst=new ArrayList<>();
        for(int a:hm.keySet()){
            // lst.add(a,hm.get(a));
            lst.add(new Pair(a,hm.get(a)));
        }
        // Collections.Sort(lst);
        Collections.sort(lst, (p1, p2) -> p2.b - p1.b);   // sort by frequency descending
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=lst.get(i).a;

        }
        return res;

    }
}
